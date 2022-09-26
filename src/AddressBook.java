import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> addresses = new ArrayList<>();

    public void addBuddy(BuddyInfo bud){
        this.addresses.add(bud);
    }

    public void removeBuddy(BuddyInfo bud){
        this.addresses.remove(bud);
    }

    public AddressBook() {
        this.addresses = new ArrayList<>();
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Tom", "Carleton","613");
        BuddyInfo buddy2 = new BuddyInfo("Rom", "Karleton","316");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1);
        addressBook.addBuddy(buddy2);
    }
}
