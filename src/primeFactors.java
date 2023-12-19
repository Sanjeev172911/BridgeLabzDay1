import java.util.Scanner;

public class primeFactors {
    public static void findPrimeFactor(int number){
        if(number<0) System.out.println("Number Needs to Be Positive to find its Prime Factors");

        int flag=0;

        for(int i=2;i*i<=number;i++){
            while(number%i==0){
                flag=1;
                System.out.println(i);
                number/=i;
            }
        }

        if(number>1){
            if(flag==0){ // if number is a prime number.
                System.out.println(1);
                System.out.println(number);
            }else{
                System.out.println(number);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number=input.nextInt();

        findPrimeFactor(number);
    }
}
