package by.it.chaikova.jd01_12;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        Integer[] left = {1,2,3,4,5,5,6,7,7};
        Integer[] right = {1,3,4,4,5,5,6,7,7};
        List<Integer> listLeft = Arrays.asList(left);
        List<Integer> listRight = Arrays.asList(right);
        Set<Integer> leftSet= new HashSet<>(listLeft);
        Set<Integer> rightSet= new TreeSet<>(listRight);
        System.out.printf("Left set=%s%n",leftSet);
        System.out.printf("Right set=%s%n",rightSet);

        Set<Integer> union = getUnion(leftSet,rightSet);
        System.out.printf("union set=%s%n",union);
        System.out.printf("Left set=%s%n",leftSet);
        System.out.printf("Right set=%s%n",rightSet);

        Set<Integer> cross = getCross(leftSet,rightSet);
        System.out.printf("cross set=%s%n",cross);
        System.out.printf("Left set=%s%n",leftSet);
        System.out.printf("Right set=%s%n",rightSet);
    }

    private static Set<Integer> getCross(Set<Integer> leftSet, Set<Integer> rightSet) {
        HashSet<Integer> result = new HashSet<>(leftSet);
        result.retainAll(rightSet);
        return result;
    }

    private static Set<Integer> getUnion(Set<Integer> leftSet, Set<Integer> rightSet) {
        HashSet<Integer> result = new HashSet<>(leftSet);
        result.addAll(rightSet);
        return result;
    }

}
