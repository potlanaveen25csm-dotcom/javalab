import java.util.Scanner;

class CharAt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter index: ");
        int i = sc.nextInt();

        System.out.println("Character = " + s.charAt(i));
    }
}