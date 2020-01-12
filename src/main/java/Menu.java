public class Menu {
    private static String MenuTitle = "Main Menu";
    private static String[] MenuOptions = {"List Minions",
                                    "Add a new minion",
                                    "Remove a minion",
                                    "Attribute evil deed to a minion",
                                    "DEBUG: Dump objects (toString)",
                                    "Exit"};


    public static void printMenu(){
        System.out.println(MenuTitle);
        for(int i=1; i<7; i++){
            System.out.println(i + ". " + MenuOptions[i-1]);
        }
    }


}
