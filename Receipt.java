import java.util.Scanner;
public class Receipt {
    public static void main(String[] args) {
        String item = "";
        String receipt = "";
        String currChars = "";
        int itemCount = 0;
        int chars = 0;
        double price = 0.00;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Jasper's cookie shop. \n We sell... \n Chocolate Chip - $1.99 \n Gingerbread - $1.99 \n Sugar - $1.99 \n Biscotti - $1.99 \n Peanut Butter - $1.99");
        while (true) {
            System.out.print("Enter item: ");
            item = scan.nextLine();
            if (item == "") {
                break;
            }
            itemCount++;
            currChars += "* Item: ";
            for (int i = 0; i < item.length(); i++) {
                if (chars <= 31) {
                    currChars = currChars + (item.charAt(i));
                    chars++;
                }
                else {
                    receipt += currChars + "\n";
                    currChars = "";
                    currChars += item.charAt(i);
                    chars = 1;
                }
            }
            receipt += currChars + "- $1.99\n";
            currChars = "";
            chars = 0;
        }
        receipt += currChars + "\n";
        for (int i = 0; i < 40; i++) {
            System.out.print("*"); 
        }
        System.out.println("");
        price = itemCount*1.99;
        receipt += "* Total: $" + price + "\n\n";
        System.out.print(receipt);
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        scan.close();
    }
}
