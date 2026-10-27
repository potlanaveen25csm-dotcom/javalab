import java.util.Scanner;

class StartsWith{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter prefix: ");
        String prefix = sc.nextLine();

        System.out.println("Starts with: " + s.startsWith(prefix));
    }
}