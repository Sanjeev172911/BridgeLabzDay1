import java.util.Scanner;

public class HarmonicNumber {
    public static void findNthHarmonic(int n){
        if(n<0) System.out.println("N should be greater than 0");

        double nthHarmonic=0.0;

        for(int i=1;i<=n;i++){
            nthHarmonic+=(double)(1.0/i);
        }

        System.out.println("nth Harmonic Number "+nthHarmonic);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        findNthHarmonic(n);
    }
}
