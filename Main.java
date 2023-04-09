import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User use = new User();
       Loser l1 = new Loser();

        while (true){
            System.out.println("1.User");
            System.out.println("2.Loser");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: use.UserLogin();
                    break;
                case 2: l1.LoserLongin();
                    break;
                case 3: return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}