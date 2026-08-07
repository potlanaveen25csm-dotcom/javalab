import java.util.Scanner;
public class TwoDArraywithScanner {
    public static void main(String[] args) {
        

    int arry[][]=new int[3][3];
    int i,j;
    Scanner sc=new Scanner(System.in);

        
    
    System.out.println("enetr values in array");

    for(i=0;i<arry.length;i++){
        for (j=0;j<arry[i].length;j++){
            arry[i][j]=sc.nextInt();
        }
    }
System.out.println("printing values in array");
for(i=0;i<arry.length;i++){
        for (j=0;j<arry.length;j++){
            System.out.println(arry[i][j]);
        }
    }
    }
    
}
