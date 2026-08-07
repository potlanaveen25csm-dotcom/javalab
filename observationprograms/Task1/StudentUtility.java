import java.util.Scanner;

class A
{
String name;
    int rn;
    double mark1, mark2, mark3;
    double total;

    public A()
    {
        this.name = "";
        this.rn = 0;
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    double calTotal()
    {
        total = mark1 + mark2 + mark3;
        return total;
    }

    double calpercentage()
    {
        double percentage = (total / 300) * 100;
        return percentage;
    }

    void display()
    {
        System.out.println("student name: " + name);
        System.out.println("student roll number: " + rn);
        System.out.println("marks in 1st subject: " + mark1);
        System.out.println("marks in 2nd subject: " + mark2);
        System.out.println("marks in 3rd subject: " + mark3);
        System.out.println("total in all subjects: " + calTotal());
        System.out.println("percentage: " + calpercentage() + "%");
    }

    void studentinfo()
    {
        System.out.println("student name: " + name);
        System.out.println("student roll number: " + rn);
        System.out.println("marks in 1st subject: " + mark1);
        System.out.println("marks in 2nd subject: " + mark2);
        System.out.println("marks in 3rd subject: " + mark3);
    }
}

public class StudentUtility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        A obj = new A();
        System.out.println("Enter name of student:");
        obj.name = sc.nextLine();

        System.out.println("Enter roll number:");
        obj.rn = sc.nextInt();

        System.out.println("Enter marks of three subjects:");
        obj.mark1 = sc.nextDouble();
        obj.mark2 = sc.nextDouble();
        obj.mark3 = sc.nextDouble();

        int choice = 0;

        while(choice != 4)
        {
            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Print student details");
            System.out.println("2. Calculate total and percentage");
            System.out.println("3. Print result");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.studentinfo();
                    break;

                case 2:
                    System.out.println("Total = " + obj.calTotal());
                    System.out.println("Percentage = " + obj.calpercentage() + "%");
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
