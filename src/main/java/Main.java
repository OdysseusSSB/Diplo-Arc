import java.io.File;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        help(sc);
    }
    public static void help(Scanner sc) {
        System.out.println("1: Import a JSON file");
        System.out.println("2: Create a blank file");
        switch(query("Option",sc)) {
            case "1":
                Loader.load(new File(query("File path",sc)));
                break;
            case "2":
                break;
            default:
            help(sc);
        }
    }
    public static String query(String query, Scanner sc) {
        System.out.print(query + ": ");
        return sc.nextLine();
    }
}