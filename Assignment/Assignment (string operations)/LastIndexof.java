import java.util.Scanner;

class LastIndexof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.nextLine().charAt(0);

        System.out.println("Last index: " + s.lastIndexOf(ch));
    }
}