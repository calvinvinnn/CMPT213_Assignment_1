import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {
    static ArrayList<MinionInformation> minion = new ArrayList<MinionInformation>();
    static Menu menu = new Menu();
    static Scanner info = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    static String st = "-1";

    public static void main(String[] args) {
        System.out.println("Welcome to the Evil Minion Tracker");
        System.out.println("by Christofer Calvin Kurniawan");

        while (true) {
            menu.printMenu();
            st = input.nextLine();
            if (st.compareTo("1") == 0) {
                noMinionListedCheck();
                printMinionList();
                actionIsDone();
            } else if (st.compareTo("2") == 0) {
                String name, height;
                System.out.println("Enter minion's name : ");
                name = info.nextLine();
                System.out.println("Enter minion's height : ");
                height = info.nextLine();
                while (height.compareTo("0") == 0) {
                    System.out.println("Enter a correct number.");
                    height = info.nextLine();
                }
                minion.add(new MinionInformation(name, Double.parseDouble(height), 0));
                System.out.println("New minion added to the list.");
                actionIsDone();
            } else if (st.compareTo("3") == 0) {
                if (minion.size() == 0) {
                    System.out.println("No minion listed!");
                    continue;
                }
                printMinionList();
                System.out.println("(Enter 0 to cancel)");
                st = input.nextLine();
                wrongChoiceCheck();
                minion.remove(Integer.valueOf(st)-1);
                System.out.println("Removed !");
                actionIsDone();
            } else if (st.compareTo("4") == 0) {
                if (minion.size() == 0) {
                    System.out.println("No minion listed!");
                    continue;
                }
                printMinionList();
                System.out.println("(Enter 0 to cancel)");
                st = input.nextLine();
                wrongChoiceCheck();
                minion.get(Integer.valueOf(st)-1).incrementEvilDeeds();
                System.out.println("Increased the number of evil deeds by 1.");
                actionIsDone();
            } else if (st.compareTo("5") == 0) {
                System.out.println(minion.toString());
                actionIsDone();
            } else if (st.compareTo("6") == 0) {
                exit(0);
            } else {
                System.out.println("Choose an available option.");
            }

        }
    }

    public static void printMinionList(){
        for (int i = 0; i < minion.size(); i++) {
            System.out.println(i + 1 + ". "
                    + minion.get(i).getName() + ", "
                    + minion.get(i).getHeight() + "m, "
                    + minion.get(i).getNumOfEvilDeeds() + " evil deed(s)");
        }
    }

    public static void wrongChoiceCheck(){
        while (Integer.valueOf(st) > minion.size() || Integer.valueOf(st) <= 0) {
            if (st.compareTo("0") == 0) {
                break;
            }
            System.out.println("Choose an available option.");
            st = input.nextLine();
        }
    }

    public static void noMinionListedCheck(){
        if (minion.size() == 0) {
            System.out.println("No minion listed!");
        }
    }

    public static void actionIsDone(){
        while (st.compareTo("0") != 0) {
            System.out.println("(Enter 0 to cancel)");
            st = input.nextLine();
        }
    }


}


