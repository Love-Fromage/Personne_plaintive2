import java.util.Scanner;
public class App {
    private static Person  personne = new Person(0, "jack");
    public static void main(String[] args) throws Exception {
        Start();
    }
    public static void Start() {
       System.out.println("Welcome to the complainer generator");
       ChooseSex();
    }
    public static void ChooseSex(){
        System.out.println("To start, please choose a Sex \n");
        System.out.println("[0]: Male");
        System.out.println("[1]: Female");
        System.out.print("Your choice:");
        Scanner scanner = new Scanner(System.in);
        int userSex = scanner.nextInt();
        // Person personne = new Person(userSex); 
        personne.sex = personne.sexPossible[userSex];
        VerifySex(personne.sex);
    }

    public static void VerifySex(String choix) {
       System.out.println("Vous avez choisi "+ choix + " ?"); 
        System.out.println("[0] Yes.");
        System.out.println("[1] Yes.");
        System.out.println(personne.sex);
        
        System.out.print("Your choice:");
        Scanner scanner = new Scanner(System.in);
        // int userConfirm = scanner.nextInt();
    }
    public static void FirstName(){
        System.out.println("So now that we've established your sex, \nlet's proceed and ask you your first name.");
        System.out.print("First name:");
        // just a comment for a commit 22
    }
}
