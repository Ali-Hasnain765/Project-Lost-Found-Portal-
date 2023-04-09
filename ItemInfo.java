import java.util.ArrayList;
import java.util.Scanner;

public class ItemInfo {
    Scanner scanner = new Scanner(System.in);
    LoginInfo info = new LoginInfo();
    static ArrayList<String> Item_list = new ArrayList<>();
    void add(){
        Item_list.add("Watch");
    }

    static void view(){
        for(int i=0; i<Item_list.size(); i++){
            System.out.printf("%d.Name: %s\n",i+1,Item_list.get(i));
        }
    }
}
