import java.util.Scanner;
public class App {
    private static Person  personne = new Person(0);
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
        int userConfirm = scanner.nextInt();
        if(userConfirm==0){
            FirstName();
        }
    }
    public static void FirstName(){
        System.out.println("firstname");
    }
}
