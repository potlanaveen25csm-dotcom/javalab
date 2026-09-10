import java.util.Scanner;

class EqualIgnorecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        System.out.println(a.equalsIgnoreCase(b));
    }
}