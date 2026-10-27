
import java.util.Scanner;

class Trim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("After trim: " + s.trim());
    }
}