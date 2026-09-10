import java.util.Scanner;
public class TryWithCatch {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter values of a and b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            int k=a/b;
            System.out.println(k);
        }
        catch(ArithmeticException e){
            System.out.println("value of b is not equal to zero");
        }
        System.out.println("done");
        sc.close();

    }

}
