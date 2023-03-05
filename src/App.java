import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the complainer generator");
        String sex = ChooseSex(scanner);
        System.out.println("sex is : " + sex);
        String firstName = ChooseFirstName(scanner);
        System.out.println("Chosen name : " + firstName);
        scanner.close();
    }

    public static String ChooseSex(Scanner scanner) {
        System.out.println("To start, please choose a Sex \n");
        System.out.println("[0]: Male");
        System.out.println("[1]: Female");
        System.out.print("Your choice:");

        int selection = scanner.nextInt();
        scanner.nextLine(); // ici on viens "annuler le enter Enter sinon ca bug dans le choose name tantot"

        switch (selection) {
            case 0:
                return "Male";
            case 1:
                return "Female";
            default:
                System.out.println("Please choose between the two values");
                return ChooseSex(scanner);
        }
    }

    public static String ChooseFirstName(Scanner scanner) {
        System.out.print("Please choose a first name : ");
        return scanner.nextLine();
    }

}
