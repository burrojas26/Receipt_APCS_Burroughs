import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to Jasper's cookie shop. \n We sell... \n Chocolate Chip \n Gingerbread \n Sugar \n Biscotti \n Peanut Butter");
        System.out.print("Enter item: ");
        String item = scan.nextLine();
        System.out.print("Enter the number of " + item + "s: ");
        int number = scan.nextInt();


        
    }
}