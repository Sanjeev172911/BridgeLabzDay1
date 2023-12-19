import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int firstNumber=input.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber=input.nextInt();

       int temp=firstNumber;
       firstNumber=secondNumber;
       secondNumber=temp;

        System.out.println("First Number "+firstNumber+" Second Number " +secondNumber);
    }
}
