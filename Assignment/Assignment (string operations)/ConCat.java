import java.util.Scanner;

class ConCat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        String c = a.concat(b);

        System.out.println("Result = " + c);
    }
}