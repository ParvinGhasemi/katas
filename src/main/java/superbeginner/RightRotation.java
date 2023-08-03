package superbeginner;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RightRotation {

    /*
    A right rotation is an operation that shifts each element of an array to the right.
    For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will
    be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this:
    {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.
    Implement rotate method that performs a right rotation on an array by a given number.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //first solution
    private static void rotate(int[] arr, int steps) {
        steps = steps % arr.length;
        for (int i = 0; i < steps; i++) {
            int temp = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }

    //second solution
    private static void rotate2(int[] arr, int steps) {
        int shortSteps = steps % arr.length;
        int[] rotatedArr = IntStream.range(0, arr.length)
                .map(i -> arr[(i - shortSteps + arr.length) % arr.length])
                .toArray();
        System.arraycopy(rotatedArr, 0, arr, 0, arr.length);
    }
}