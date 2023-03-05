import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // initialiasation d'un scanner pour lire des inputs dans le programme
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the complainer generator");
        String sex = ChooseSex(scanner);
        String firstName = ChooseFirstName(scanner);
        System.out.println(sex + " " + firstName);
        boolean wantLastName = askLastName(scanner);
        System.out.println(sex + " " + firstName + " " + wantLastName);
        scanner.close();
    }

    public static String ChooseSex(Scanner scanner) {
        System.out.println("To start, please choose a Sex \n");
        System.out.println("[0]: Male");
        System.out.println("[1]: Female");
        System.out.print("Your choice:");

        int selection = scanner.nextInt();
        // scanner.nextLine(); // ici on viens "annuler le enter Enter sinon ca bug dans le choose name tantot"
        System.in.

        switch (selection) {
            case 0:
                return "Male 👨‍🦱";
            case 1:
                return "Female 👩‍🦰";
            default:
                System.out.println("Please choose between the two values");
                return ChooseSex(scanner);
        }
    }

    public static String ChooseFirstName(Scanner scanner) {
        System.out.print("Please choose a first name : ");
        return scanner.nextLine();
    }

    public static boolean askLastName(Scanner scanner) {
        System.out.println("Would you like to choose a last name?");
        System.out.println("[0] : Yes");
        System.out.println("[1] : No");

        int selection = scanner.nextInt();
        scanner.nextLine();

        switch (selection) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                System.out.println("Please choose between the two values");
                return askLastName(scanner);
        }
    }
}