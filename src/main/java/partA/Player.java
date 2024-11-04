package partA;

public class Player {
    //Fields
    public static String name;
    public static double height;
    public static int yearsInLeague;

    //Constructor
    public Player(String name, double height, int yearsInLeague){
        this.name = name;
        this.height = height;
        this.yearsInLeague = yearsInLeague;
    }

    //Methods
    public static String think(){
        String response = "";
        response += ("I will win.");
        return response;
    }
    public static String display(){
        String response = "";
        response +=("Name: " +name);
        response +=("Height: " +height);
        response +=("Years in League: " +yearsInLeague);
        return response;
    }

    public static void main(String[] args) {
        String output = display();
        System.out.print(output);
    }
}
