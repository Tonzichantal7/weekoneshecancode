//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][] A =  {
                {1,2},
                {4,5}
        };
        int [][] B =  {
                {1,2},
                {3,4}
        };
        int rowA = A.length;
        int colA = A[0].length;
        int rowB = B.length;
        int colB = B[0].length;
        if(colA != rowB) {
            System.out.println("not possible");
            return;
        }
        int [][] C = new int[rowA][colB];
        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colB; j++){
                C[i][j] = 0;
                for(int k = 0; k < colA; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }



        }
        System.out.println("resulting matrix is");
        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colB; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}