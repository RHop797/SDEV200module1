//*This program checks if two user inputted arrays are identical */

public class ArrayComparison {

    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if dimensions are the same
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt user for first array
        System.out.println("Enter list1: ");
        int[][] m1 = readMatrix(input);

        // Prompt user for second array
        System.out.println("Enter list2: ");
        int[][] m2 = readMatrix(input);

        // Check if the arrays are identical
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
        
        input.close();
    }
    
    public static int[][] readMatrix(java.util.Scanner input) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}
