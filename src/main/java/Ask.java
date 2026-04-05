import java.util.Scanner;

public class Ask {
    public static String query(String query) {
        System.out.print(query + ": ");
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        return str;
    }
}
