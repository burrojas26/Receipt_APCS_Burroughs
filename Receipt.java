import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter the city you are from: ");
        String city = scan.nextLine();
        System.out.println("Hello, " + name + ". You are from " + city);
    }
}