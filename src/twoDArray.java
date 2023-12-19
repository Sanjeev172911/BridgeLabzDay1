import java.util.Scanner;

public class twoDArray {
    public static void printMatrix(int [][]mat){
        int n=mat.length;
        int m=mat[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the number of rows");
        int n=input.nextInt();
        System.out.println("enter the number of collumn");
        int m=input.nextInt();

        int[][] matrix=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val=input.nextInt();
                matrix[i][j]=val;
            }
        }

        printMatrix(matrix);

    }
}
