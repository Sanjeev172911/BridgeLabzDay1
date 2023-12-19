import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOf3Integer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            int val=input.nextInt();

            arr[i]=val;
        }

        ArrayList<int[]>arrayListOfArray=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        int[] trio = {i, j, k};
                        arrayListOfArray.add(trio);
                    }
                }
            }
        }

        System.out.println("Distinct Triplet which sum to zeros are "+arrayListOfArray.size());

        for (int[] array : arrayListOfArray) {
//            System.out.println(Arrays.toString(array));
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
