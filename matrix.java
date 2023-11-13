// import java.util.Scanner;

// public class matrix {
//     public static void main(String[] args) {

//         // int [][] finalmarks = {{2,3,5},{2,3,19}};

//         // System.out.println(finalmarks[1][2]);

//         Scanner in = new Scanner(System.in);

//         int[][] arr = new int[3][3];

//         int row = in.nextInt();
//         int col = in.nextInt();

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; i < col; j++) {
//                 arr[i][j] = in.nextInt();
//             }
//         }
        
//         // print
        
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; i < col; j++) {
//                 System.out.println(arr[i][j]);
//             }
//         }
        
//     }
// }


import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // print

        System.out.println("The matrix you entered:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        in.close(); // Close the scanner when done
    }
}

