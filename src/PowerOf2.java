
import java.util.Scanner;

public class PowerOf2 {
    public static void printPowerOf2(int n){
        int res=1;
        for(int i=0;i<n;i++){
            System.out.println("2^"+i+" = "+res);
            res*=2;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<0) System.out.println("N should be greater than 0");
        printPowerOf2(n);
    }
}
