import java.util.Scanner;

class EndsWith{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter suffix: ");
        String suffix = sc.nextLine();

        System.out.println("Ends with: " + s.endsWith(suffix));
    }
}