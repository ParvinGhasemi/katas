package superbeginner;

import java.util.Arrays;
import java.util.Scanner;

public class FittingTwoBoxes {
/* There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2.
You need to determine whether one of the boxes can be put inside the other. It should go in without sticking out.
You can rotate both boxes as you want.
Important: two equally sized boxes cannot be placed inside one another. See the third test case as
an example of how the borderline case should be treated.

Input consists of two lines:
the first line contains numbers X1, Y1, Z1;
the second line contains numbers X2, Y2, Z2.
All numbers are integers and greater than 0.

Output:
"Box 1 < Box 2", if the first box can be put inside the second box ;
"Box 1 > Box 2", if the second box can be put inside the first box;
otherwise, output "Incompatible".

Tip: One box can be placed inside the other only if it is strictly smaller by all three dimensions.
It does not necessarily mean that boxes cannot have one equal side, as you can rotate them.*/

    //first solution
    public static void fitTwoBoxes(int[] box1, int[] box2) {
        Arrays.sort(box1);
        Arrays.sort(box2);
        if(boxFits(box1, box2)) {
            System.out.println("Box 1 < Box 2");
        } else if(boxFits(box2, box1)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }

    public static boolean boxFits(int[] smallerBox, int[] largerBox) {
        return smallerBox[0] < largerBox[0] && smallerBox[1] < largerBox[1] && smallerBox[2] < largerBox[2];
    }


    //second solution
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] boxA = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int[] boxB = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < boxA.length; i++) {
            if (boxA[i] < boxB[i]) {
                a++;
            }
            if (boxA[i] > boxB[i]) {
                b++;
            }
        }
        System.out.println(a == 3 ? "Box 1 < Box 2" : b == 3 ? "Box 1 > Box 2" : "Incompatible");
    }*/
}
