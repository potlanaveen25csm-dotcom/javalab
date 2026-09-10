import java.util.Scanner;

class Substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("enter two index value that print substring");
    int i=sc.nextInt();
    int j=sc.nextInt();

        System.out.println("Substring = " + s.substring(i,j));
    }
}