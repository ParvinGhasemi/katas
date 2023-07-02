package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

    /*Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
    It should remove all values from list a which are present in list b keeping their order.
    Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
    If a value is present in b, all of its occurrences must be removed from the other:
    Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}*/

public class ArrayDiff {
    //first solution

   public static int[] difference(int[] a, int[] b) {
        return IntStream.of(a)
                .filter(valueInA -> IntStream.of(b)
                        .noneMatch(valueInB -> valueInA == valueInB ))
                .toArray();
    }


    //second solution
    /*
    public static int[] difference(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream()
                .mapToInt(value -> value).toArray();
    }*/

    //thirdSolution
    /*
    public static int[] difference(int[] a, int[] b) {
    List<Integer> resultList = new ArrayList<>();
    List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());

    for (int i : a) {
        if (!listB.contains(i)) {
            resultList.add(i);
        }
    }
    return resultList.stream().mapToInt(value -> value).toArray();
    }
    */
}
