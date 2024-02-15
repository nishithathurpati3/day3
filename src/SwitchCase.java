import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Traffic Colour:");
        String colour=scan.next();
        colour= colour.toUpperCase();
        switch(colour){
            case "RED":
                System.out.println("Stop");
                break;
            case "YELLOW":
                System.out.println("Ready");
                break;
            case "GREEN":
                System.out.println("GO");
                break;
            default:
                System.out.println("Please enter a valid colour :)");
                break;
        }

    }
}
