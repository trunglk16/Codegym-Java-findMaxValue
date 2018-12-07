import java.util.Arrays;
import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {

        System.out.println("Insert the size");
        System.out.println("Collums:");
        Scanner input = new Scanner(System.in);
        int col = input.nextInt();

        System.out.println("Row:");
        Scanner input2 = new Scanner(System.in);
        int row = input2.nextInt();

        int[][] arr = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Insert numbers in the  " + (i + 1) + " row");
            for (int j = 0; j < arr[0].length; j++) {
                Scanner input3 = new Scanner(System.in);
                arr[i][j] = input3.nextInt();

            }

        }
        System.out.println("Array: ");
        printArray(arr);
        System.out.println("The max value in array:" + findMax(arr));


    }

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int column = 0; column < arr[i].length; column++) {
                System.out.print(arr[i][column] + " ");
            }
            System.out.println();

        }
    }

    static int findMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }

            }

        }

        return max;
    }
}

