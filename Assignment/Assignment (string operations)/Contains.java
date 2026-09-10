import java.util.Scanner;

class Contains{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter text to search: ");
        String x = sc.nextLine();

        System.out.println(s.contains(x));
    }
}