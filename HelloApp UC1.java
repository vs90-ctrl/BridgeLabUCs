import java.util.*;

class NameManager {
    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
        System.out.println("Name added: " + name);
    }

    public void removeName(String name) {
        if (names.remove(name)) {
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Name not found.");
        }
    }

    public void listNames() {
        if (names.isEmpty()) {
            System.out.println("No names stored.");
        } else {
            System.out.println("Stored Names:");
            for (String n : names) {
                System.out.println("- " + n);
            }
        }
    }
}

public class HelloApp {

    static void printBanner(String text) {
        int length = text.length() + 4;

        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println("* " + text + " *");

        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NameManager manager = new NameManager();

        System.out.println("===== Hello App =====");

        while (true) {

            System.out.println("\n1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. List Names");
            System.out.println("4. Banner Greeting");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    manager.addName(name);
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    String remove = sc.nextLine();
                    manager.removeName(remove);
                    break;

                case 3:
                    manager.listNames();
                    break;

                case 4:
                    System.out.print("Enter name for banner: ");
                    String bannerName = sc.nextLine();
                    printBanner("Hello " + bannerName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}