/**
 * Prints the options for the user to choose and also consist of title and welcome of the main menu
 */

public class Menu {
    private static String MenuTitle = "* Main Menu *";
    private static String[] MenuOptions = {"List Minions",
                                    "Add a new minion",
                                    "Remove a minion",
                                    "Attribute evil deed to a minion",
                                    "DEBUG: Dump objects (toString)",
                                    "Exit"};


    public static void printMenu(){
        printStars(MenuTitle);
        System.out.println(MenuTitle);
        printStars(MenuTitle);
        for(int i=1; i<7; i++){
            System.out.println(i + ". " + MenuOptions[i-1]);
        }
    }
    public static void printWelcome(){
        String welcome = "Welcome to the Evil Minion Tracker";;
        String madeBy = "by Christofer Calvin Kurniawan";
        printStars(welcome);
        System.out.println(welcome + "\n" + madeBy);
        printStars(welcome);
        System.out.println("");
    }
    public static void printStars(String word){
        for(int i=0;i<word.length(); i++){
            System.out.print("*");
        }
        System.out.println("");
    }


}
