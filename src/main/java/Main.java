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
            while (true) {
                st = input.nextLine();
                int optionCheck = Integer.valueOf(st);
                if (optionCheck > 0 && optionCheck < 7)
                    break;
                System.out.println("Choose an available option.");
            }
            switch (st) {
                case "1":
                    noMinionListedCheck();
                    printMinionList();
                    actionIsDone();
                    break;
                case "2":
                    String name, height;
                    System.out.println("Enter minion's name : ");
                    name = info.nextLine();
                    System.out.println("Enter minion's height : ");
                    height = info.nextLine();
                    while (Double.valueOf(height) <= 0) {
                        System.out.println("Enter a correct number.");
                        height = info.nextLine();
                    }
                    minion.add(new MinionInformation(name, Double.parseDouble(height), 0));
                    System.out.println("New minion added to the list.");
                    actionIsDone();
                    break;
                case "3":
                    if (minion.size() == 0) {
                        System.out.println("No minion listed!");
                        while (st.compareTo("0") != 0) {
                            cancel_Enter_0();
                        }
                        continue;
                    }
                    printMinionList();
                    cancel_Enter_0();
                    wrongChoiceCheck();
                    minion.remove(Integer.valueOf(st) - 1);
                    System.out.println("Removed !");
                    actionIsDone();
                    break;
                case "4":
                    if (minion.size() == 0) {
                        System.out.println("No minion listed!");
                        while (st.compareTo("0") != 0) {
                            cancel_Enter_0();
                        }
                        continue;
                    }
                    printMinionList();
                    cancel_Enter_0();
                    wrongChoiceCheck();
                    minion.get(Integer.valueOf(st) - 1).incrementEvilDeeds();
                    System.out.println("Increased the number of evil deeds by 1.");
                    actionIsDone();
                    break;
                case "5":
                    for (int i = 1; i <= minion.size(); i++){
                        System.out.println(i + ". " + minion.get(i-1).toString());
                    }
                    actionIsDone();
                    break;
                case "6":
                    exit(0);
            }
        }
    }


    public static void cancel_Enter_0() {
        System.out.println("(Enter 0 to cancel)");
        st = input.nextLine();
    }

    public static void printMinionList() {
        for (int i = 0; i < minion.size(); i++) {
            System.out.println(i + 1 + ". "
                    + minion.get(i).getName() + ", "
                    + minion.get(i).getHeight() + "m, "
                    + minion.get(i).getNumOfEvilDeeds() + " evil deed(s)");
        }
    }

    public static void wrongChoiceCheck() {
        while (Integer.valueOf(st) > minion.size() || Integer.valueOf(st) <= 0) {
            if (st.compareTo("0") == 0) {
                break;
            }
            System.out.println("Choose an available option.");
            st = input.nextLine();
        }
    }

    public static void noMinionListedCheck() {
        if (minion.size() == 0) {
            System.out.println("No minion listed!");
        }
    }

    public static void actionIsDone() {
        while (st.compareTo("0") != 0) {
            System.out.println("(Enter 0 to cancel)");
            st = input.nextLine();
        }

    }


}


