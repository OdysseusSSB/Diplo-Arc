public class Main {
    public static void main(String[] args) {
        help();
    }
    public static void help() {
        System.out.println("1: Import a JSON file");
        System.out.println("2: Create a blank file");
        switch(Ask.query("Option")) {
            case "1":
                Loader.main();
                break;
            case "2":
                break;
            default:
            help();
        }
    }
}