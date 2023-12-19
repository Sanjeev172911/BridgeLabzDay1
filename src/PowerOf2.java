
import java.util.Scanner;

public class PowerOf2 {
    public static void printPowerOf2(int n){
        int res=1;
        for(int i=0;i<n;i++){
            System.out.println(res);
            res*=2;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<0)
            printPowerOf2(n);
    }

    public static class HarmonicNumber {
        public static void findNthHarmonicNumber(int n){
            double res=0;

            for(int i=1;i<=n;i++){
                res=res+((double)1.0/i);
            }

            System.out.print("Nth Harmonic Number ");
            System.out.println(res);
        }

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();

            findNthHarmonicNumber(n);
        }
    }

    public static class PrimeFactors {
        public static void findPrimeFactors(int n){

            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                    while(n%i==0){
                        n/=i;
                    }
                }
            }

            if(n>1) System.out.println(n);
        }
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter n");
            int n=input.nextInt();

            //        for(int i=1;i<=n;i++){
            //            for(int j=1;j<=i;j++){
            //                System.out.print(j);
            //            }
            //            System.out.print("\n");
            //        }
            //
            //        System.out.println();

            for(int i=1;i<=n;i++){
                if(i==1 || i==n){
                    for(int j=1;j<=n;j++)
                        System.out.print("*");
                }else{
                    System.out.print("*");
                    for(int j=2;j<=n-1;j++)
                        System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            }



        }
    }
}
