import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        
        
        String item = "";
        String receipt = "";
        String currChars = "";
        int number;
        int chars = 0;
        String receiptStatement = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jasper's cookie shop. \n We sell... \n Chocolate Chip \n Gingerbread \n Sugar \n Biscotti \n Peanut Butter");
        
        while (item != "end") {
            System.out.print("Enter item: ");
            item = scan.nextLine();
            // System.out.print("Enter the number of " + item + "s: ");
            // number = scan.nextInt();
            for (int i = 0; i < 40; i++) {
            System.out.print("*");
            
            }
            System.out.println("");
            for (int i = 0; i < item.length(); i++) {
                if (chars <= 40) {
                    currChars = currChars + (item.charAt(i));
                    chars++;
                }
                else {
                    receipt += currChars + "\n";
                    currChars = item.charAt(i);
                }
                
            }
            
        }
    }
     
}

//.charAt();