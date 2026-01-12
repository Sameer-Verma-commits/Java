import java.util.Scanner;
public class Sum_First_Last_Digit
{
    public static void main(String args[])
    {
        //Taking input from user
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=input.nextInt();

        //Finding First & Last Digit
        int last= num % 10;
        while(num >= 10)
        {
            num/=10;
        }
        int first= num;
        //Calculating sum
        int sum=first+last;
        System.out.println("Sum of First & Last Digit = "+sum);
        return;
    }

}