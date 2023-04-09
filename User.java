import java.util.Scanner;

public class User extends ItemInfo{
    Scanner scanner = new Scanner(System.in);
    void UserLogin(){
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        if(username.equals(info.getUser_username())){
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if(pass.equals(info.getUser_password())){
                while (true) {
                    System.out.println("1.View Update Item");
                    System.out.println("2.Add Item");
                    System.out.println("3.Remove Item");
                    System.out.println("4.Exit");
                    System.out.println("Enter Your Choice");
                    ItemInfo c1 = new ItemInfo();
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            c1.add();
                            c1.view();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 2:
                            adminAdd();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 3:
                            adminRemove();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 4:
                            return;
                    }
                }
            }else System.out.println("Invalid Password");
        }else System.out.println("Invalid Username");
    }
    void adminAdd(){
        System.out.println("How Many To Add: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<size; i++){
            System.out.println("Enter Item Name: ");
            Item_list.add(scanner.nextLine());
            System.out.println("Enter Item Code: ");
            String c = scanner.nextLine();
        }
        System.out.println("Item Saved");
    }
    void adminRemove(){
        scanner.nextLine();
        System.out.println("Enter The name of the Item You want to remove: ");
        String name = scanner.nextLine();
        if(Item_list.contains(name)){
            int index=Item_list.indexOf(name);
            System.out.println("Item Removed "+name);
            Item_list.remove(name);
        }
    }
}
