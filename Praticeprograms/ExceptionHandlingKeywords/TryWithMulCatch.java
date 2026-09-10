import java.util.InputMismatchException;
import java.util.Scanner;
public class TryWithMulCatch {

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter values of a ");
     a=sc.nextInt();
     System.out.println("enter value of b");
        b=sc.nextInt();
    
            int k=a/b;
            System.out.println(k);
        }
        catch(InputMismatchException e){
            System.out.println("give only integers to a and b");
        }
        catch(ArithmeticException e){
            System.out.println("value of b is not equal to zero");
        }
        System.out.println("done");
        sc.close();

    }

}
