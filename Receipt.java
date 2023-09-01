import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println("");
        String item = "";
        String receiptStatement = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jasper's cookie shop. \n We sell... \n Chocolate Chip \n Gingerbread \n Sugar \n Biscotti \n Peanut Butter");
        
        while (item != "end")
        System.out.print("Enter item: ");
        String item = scan.nextLine();
        System.out.print("Enter the number of " + item + "s: ");
        int number = scan.nextInt();
        String[] currItem = {item};

        
        for (int i = 0; i < currItem.length; i++) {
                receiptStatement += currItem[i];
                while (receiptStatement.length() < 40) {
                    System.out.print(receiptStatement);
                    
                }
            }
        
    }
}