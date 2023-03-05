import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the complainer generator");
        String userSex = ChooseSex();
        System.out.println("sex is : "+userSex);
    }

    public static String ChooseSex(){
        System.out.println("To start, please choose a Sex \n");
        System.out.println("[0]: Male");
        System.out.println("[1]: Female");
        System.out.print("Your choice:");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        scanner.close();
        
        switch(selection){
            case 0:
                return "Male";
            case 1:
                return "Female";
            default:
                System.out.println("please choose between the two values");
                return ChooseSex();       
        }
    }

    // public static void VerifySex(String choix) {
    //    System.out.println("Vous avez choisi "+ choix + " ?"); 
    //     System.out.println("[0] Yes.");
    //     System.out.println("[1] No."); 
    //     System.out.print("Your choice:");
    //     Scanner scanner = new Scanner(System.in);
	//     int userConfirm = scanner.nextInt();
    //     if(userConfirm == 0){
    //         FirstName();
    //     }
    //     if(userConfirm==1){
    //         ChooseSex();
    //     }
    // }
    // public static void FirstName(){
    //     System.out.println("So now that we've established your sex, \nlet's proceed and ask you your first name.");
    //     System.out.print("First name:");
    //     Scanner scanner = new Scanner(System.in);
    //     String userFirstName = scanner.nextLine();
    //     personne.firstName = userFirstName;
    //     System.out.println("Hello "+personne.firstName);
    // }
}
