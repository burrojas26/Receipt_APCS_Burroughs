import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        String receiptStatement = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jasper's cookie shop. \n We sell... \n Chocolate Chip \n Gingerbread \n Sugar \n Biscotti \n Peanut Butter");
        System.out.print("Enter item: ");
        String item = scan.nextLine();
        System.out.print("Enter the number of " + item + "s: ");
        int number = scan.nextInt();


        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println("")
        while (receiptStatement.length() < 40) {
            System.out.print(receiptStatement);
            for (int i = 0; i < item.length(); i++) {
                receiptStatement = receiptStatement + item;
            }
        }
    }
}