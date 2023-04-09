import java.util.ArrayList;
import java.util.Scanner;

public class Loser extends ItemInfo {


    void LoserLongin() {
        ItemInfo i1 = new ItemInfo();
        System.out.println("Enter Username: ");
        String user = scanner.nextLine();
        if (user.equals(info.getLoser_username())) {
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if (pass.equals(info.getLoser_password())) {
                while (true) {
                    System.out.println("1.view Item: ");
                    System.out.println("2.Loss Item post: ");
                    System.out.println("3.Exit");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        i1.view();
                    } else if (choice == 2) {
                        System.out.println("Enter Loseer Product Name: ");
                        Scanner sc = new Scanner(System.in);
                        String na = sc.nextLine();
                        System.out.println();
                        System.out.println("Any Unique Information: ");
                        String uin = sc.nextLine();
                        System.out.println("1.Search ?");
                        int x = sc.nextInt();
                        if (x == 1) {
                            if (Item_list.contains(uin)) {
                                System.out.println("Item Found!");
                            }
                        }
                    }

                }
            }
                    else System.out.println("Invalid Password");
            }
        else System.out.println("Invalid Username");
        }


    }

