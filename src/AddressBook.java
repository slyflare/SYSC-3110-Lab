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
        System.out.println("Address Book");
    }
}
