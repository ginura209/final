package package1;


import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    private static int id;
    private static String name;
    private static String yob;
    private static int sugar_level;

    private static ArrayList<BloodSugar> users = new ArrayList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome To The Blood_Sugar_Monitor ");

        int input;

        while (true) {
            displayMenu();
            input = scanner.nextInt();

            switch (input) {
                case 0:
                    exit();
                    break;
                case 1:
                    create();
                    break;
                case 2:
                    index();
                    break;
                case 3:
                    System.out.println("Please Enter User Id");
                    input = scanner.nextInt();
                    view(input);
                    break;
                case 4:
                    delete();
                    break;

            }
        }

    }

    public static void displayMenu() {
        System.out.println("What's you want?,");
        System.out.println("(1) Create a New Record");
        System.out.println("(2) Show All Users Records");
        System.out.println("(3) View User's Record");
        System.out.println("(4) Delete All Records");
        System.out.println("(0) Exit Application");
    }

    public static void index() {//show all records
        System.out.println("All Users");
        users.forEach(user -> user.display());
    }

    public static void view(int id) { // show onw record
        users.forEach(user -> {
            if (user.getId() == id) {
                user.display();
            }
        });
    }

    public static void create() {//create user
        System.out.println("User Details");

        System.out.println("User Id");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("User Name");
        name = scanner.nextLine();

        System.out.println("Birthday");
        yob = scanner.nextLine();

        System.out.println("Blood Sugar Level");
        sugar_level = scanner.nextInt();

        BloodSugar user = new BloodSugar(id, name, yob, sugar_level);

        users.add(user);
    }

    public static void delete() {//delete user
        System.out.println("All Users Deleted");
        users.clear();
    }

    public static void exit() {
        System.out.println("Exit on Application");
        System.exit(0);
    }

}
