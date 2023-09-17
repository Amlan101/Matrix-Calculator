package Projects;
import java.util.*;
public class Math_Experiential_Learning {

    //Attributes of the Class
    static int rows1, rows2;
    static int cols1, cols2;
    static int matrix_1[][] = new int [rows1] [cols1];
    static int matrix_2[][] = new int [rows2] [cols2];

    //Main Function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        starPattern();
        System.out.println("\n \n \t<Press 1> to find transpose of the Matrix \n \t<Press 2> to find rank of the Matrix \n \t<Press 3> to find determinant of the Matrix \n \t<Press 4> to find multiplication of two Matrices \n \t<Press 5> to find addition of two Matrices \n \t<Press 6> to find substraction of two Matrices \n");
        starPattern();
        System.out.println();
        int choice = sc.nextInt();
        switch(choice){

            //Transpose of Matrix
            case 1:
                starPattern();
                System.out.println("\n \tEnter the number of rows: ");
                rows1 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns: ");
                cols1 = sc.nextInt();
                matrix_1 = inputMatrix(rows1, cols1);
                starPattern();
                System.out.println("\n \tThe inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                transpose(rows1,cols1,matrix_1);
                starPattern();
                break;

            //Rank of Matrix    
            case 2:
                System.out.println("\n \tEnter the number of rows: ");
                rows1 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns: ");
                cols1 = sc.nextInt();
                matrix_1 = inputMatrix(rows1, cols1);
                starPattern();
                System.out.println("\n \tThe inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                rank();
                starPattern();
                break;

            //Determinant of Matrix
            case 3: 
                System.out.println("\n \tEnter the number of rows: ");
                rows1 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns: ");
                cols1 = sc.nextInt();
                matrix_1 = inputMatrix(rows1, cols1);
                starPattern();
                System.out.println("\n \tThe inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                determinant();
                starPattern();
                break;

            //Multiplying Matrices    
            case 4: 
                System.out.println("\n \tEnter the number of rows for 1st Matrix: ");
                rows1 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns for 1st Matrix: ");
                cols1 = sc.nextInt();
                matrix_1 = inputMatrix(rows1, cols1);
                System.out.println();
                starPattern();
                System.out.println();
                System.out.println("\n \tEnter the number of rows for 2nd Matrix: ");
                rows2 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns for 2nd Matrix: ");
                cols2 = sc.nextInt();
                matrix_2 = inputMatrix(rows2, cols2);
                starPattern();
                System.out.println("\n \tThe 1st inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                System.out.println("\n \tThe 2nd inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_2);
                starPattern();
                int ansMultiply[][] = multiply(rows1,cols1,matrix_1,rows2,cols2,matrix_2);
                System.out.println();
                System.out.println("\n \tMultiplication of both the matrices: ");
                printMatrix(rows1, cols2, ansMultiply);
                starPattern();
                break;

            //Adding the Matrices    
            case 5:
                System.out.println("\n \tEnter the number of rows for 1st Matrix: ");
                rows1 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns for 1st Matrix: ");
                cols1 = sc.nextInt();
                matrix_1 = inputMatrix(rows1, cols1);
                System.out.println();
                starPattern();
                System.out.println();
                System.out.println("\n \tEnter the number of rows for 2nd Matrix: ");
                rows2 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns for 2nd Matrix: ");
                cols2 = sc.nextInt();
                matrix_2 = inputMatrix(rows2, cols2);
                starPattern();
                System.out.println("\n \tThe 1st inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                System.out.println("\n \tThe 2nd inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                int ansAdd[][] = addition(rows1, cols1, matrix_1, rows2, cols2, matrix_2);
                System.out.println("\n \tAddition of both the matrices: ");
                printMatrix(rows1, cols1, ansAdd);
                starPattern();
                break;

            //Substracting the Matrices    
            case 6:
                System.out.println("\n \tEnter the number of rows for 1st Matrix: ");
                rows1 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns for 1st Matrix: ");
                cols1 = sc.nextInt();
                matrix_1 = inputMatrix(rows1, cols1);
                System.out.println();
                starPattern();
                System.out.println();
                System.out.println("\n \tEnter the number of rows for 2nd Matrix: ");
                rows2 = sc.nextInt();
                System.out.println("\n \tEnter the number of columns for 2nd Matrix: ");
                cols2 = sc.nextInt();
                matrix_2 = inputMatrix(rows2, cols2);
                starPattern();
                System.out.println("\n \tThe 1st inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                System.out.println("\n \tThe 2nd inputted matrix looks like: ");
                printMatrix(rows1, cols1, matrix_1);
                starPattern();
                int ansSub[][] = substraction(rows1, cols1, matrix_1, rows2, cols2, matrix_2);
                System.out.println("\n \tThe Substraction of both the matrices: ");
                printMatrix(rows1, cols1, ansSub);
                starPattern();
                break;
        }
        sc.close();
    }

    static void transpose(int r1, int c1, int[][] arr1){
        System.out.println("\n \tTranspose of the Given Matrix: ");
        for(int i =0;i<c1;i++){
            for(int j =0;j<r1;j++){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println();
        }
    }

    static int[][] multiply(int r1, int c1 ,int[][] arr1,int r2,int c2,int[][] arr2){
        int res[][] = new int[r1][c2];
        if( r2 != c1){
            System.out.println("\n \tMatrix Multiplication is not possible ");
        }
        else{
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
        return res;
    }


    static int[][] addition(int r1, int c1 ,int[][] arr1,int r2,int c2,int[][] arr2){
        int res[][] = new int[r1][c2];
        if( r2 != r1 && c2 != c1){
            System.out.println("\n \tMatrix Addition is not possible ");
        }        
        else{
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                        res[i][j] += arr1[i][j] + arr2[i][j];
                }
            }
        }
        return res;
    }


    static int[][] substraction(int r1, int c1 ,int[][] arr1,int r2,int c2,int[][] arr2){
        int res[][] = new int[r1][c2];
        if( r2 != r1 && c2 != c1){
            System.out.println("\n \tMatrix Substraction is not possible ");
        }        
        else{
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                        res[i][j] += arr1[i][j] - arr2[i][j];
                }
            }
        }
        return res;
    }

    public static void rank(){
        //
    }

    public static void determinant(){
        //
    }
    
    //Print the elements of a matrix
    static void printMatrix(int r, int c, int[][] arr) {
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Input the elements of a matrix
    static int[][] inputMatrix(int r,int c){
        int[][] arr =  new int[r][c];
        Scanner sc = new Scanner(System.in);
        System.out.println("\n \tEnter elements of Matrix:"); 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    //Helper function to print the pattern
    public static void starPattern(){
        for(int i =0; i<15; i++){
            System.out.print("+ - ");
        }
    }
}