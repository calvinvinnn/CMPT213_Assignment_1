import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {
    static ArrayList<MinionInformation> minion = new ArrayList<MinionInformation>();
    static Menu menu = new Menu();

    public static void main(String[] args) {
        System.out.println("Welcome to the Evil Minion Tracker");
        System.out.println("by Christofer Calvin Kurniawan");
        Scanner info = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String st = "-1";
        while (st.compareTo("0") != 0) {
            menu.printMenu();
            st = input.nextLine();
            if (st.compareTo("1") == 0) {
                if (minion.size() == 0) {
                    System.out.println("No minion listed!");
                }
                for (int i = 0; i < minion.size(); i++) {
                    System.out.println(i + 1 + ". "
                            + minion.get(i).getName() + ", "
                            + minion.get(i).getHeight() + "m, "
                            + minion.get(i).getNumOfEvilDeeds() + " evil deed(s)");
                }
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
                continue;
            } else if (st.compareTo("3") == 0) {
                if (minion.size() == 0) {
                    System.out.println("No minion listed!");
                    continue;
                }
                for (int i = 0; i < minion.size(); i++) {
                    System.out.println(i + 1 + ". "
                            + minion.get(i).getName() + ", "
                            + minion.get(i).getHeight() + "m, "
                            + minion.get(i).getNumOfEvilDeeds() + " evil deed(s)");
                }
                System.out.println("(Enter 0 to cancel)");

                st = input.nextLine();
                while (Integer.valueOf(st) > minion.size() || Integer.valueOf(st) <= 0) {
                    if (st.compareTo("0") == 0) {
                        break;
                    }
                    System.out.println("Choose an available option.");
                    st = input.nextLine();
                }
                minion.remove(Integer.valueOf(st)-1);
                System.out.println("Removed !");


            } else if (st.compareTo("4") == 0) {
                if (minion.size() == 0) {
                    System.out.println("No minion listed!");
                    continue;
                }
                for (int i = 0; i < minion.size(); i++) {
                    System.out.println(i + 1 + ". "
                            + minion.get(i).getName() + ", "
                            + minion.get(i).getHeight() + "m, "
                            + minion.get(i).getNumOfEvilDeeds() + " evil deed(s)");
                }
                System.out.println("(Enter 0 to cancel)");

                st = input.nextLine();
                while (Integer.valueOf(st) > minion.size() || Integer.valueOf(st) <= 0) {
                    if (st.compareTo("0") == 0) {
                        break;
                    }
                    System.out.println("Choose an available option.");
                    st = input.nextLine();
                }
                //how to change numevildeeds

            } else if (st.compareTo("5") == 0) {
                System.out.println(minion.toString());
            } else if (st.compareTo("6") == 0) {
                exit(0);
            } else {
                System.out.println("Choose an available option.");
            }
            while (st.compareTo("0") != 0) {
                System.out.println("(Enter 0 to cancel)");
                st = input.nextLine();
            }
            st = "reset";
        }
    }


}


