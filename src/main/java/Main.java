import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    ArrayList<MinionInformation> minion = new ArrayList<MinionInformation>();
    static Menu menu = new Menu();
    public static void main(String[] args){
        System.out.println("Welcome to the Evil Minion Tracker");
        System.out.println("by Christofer Calvin Kurniawan");
        menu.printMenu();
        String st = "-1";
        while(st.compareTo("0") != 0) {
            Scanner input = new Scanner(System.in);
            st = input.nextLine();
            if (st.compareTo("1") == 0) {
                System.out.println("a");
            } else if (st.compareTo("2") == 0) {
                System.out.println("b");
            } else if (st.compareTo("3") == 0) {

            } else if (st.compareTo("4") == 0) {

            } else if (st.compareTo("5") == 0) {

            } else if (st.compareTo("6") == 0) {
                exit(0);
            } else {
                System.out.println("Choose an available option.");
            }
        }
    }


}


