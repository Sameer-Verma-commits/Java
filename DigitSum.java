import java.util.Scanner;
public class DigitSum
{
    public static void main(String args[])
    {
        //Taking Input From User
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num= input.nextInt();

        //Calculating Sum of digits
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of Digits = "+sum);
        return;
    } 
}