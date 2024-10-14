package interview_programs.java8programs;

// merge two unsorted array into the sorted array



import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {23,54,34,12,34,78};
        int[] b = {43,21,45,78,43,12};
        Set<Integer> margeSet =  IntStream.concat(Arrays.stream(a),Arrays.stream(b)).boxed().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("merge two array: " + margeSet);
    }
}
