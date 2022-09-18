/* Vimal Gunasegaran
* 101155249*/

public class BuddyInfo {

    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo p1 = new BuddyInfo("Dave");
        System.out.println("Hello " + p1.getName() + "!");
    }
}
