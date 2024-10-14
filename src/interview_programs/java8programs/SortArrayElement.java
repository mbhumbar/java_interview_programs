package interview_programs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 45, 32, 10, 43, 20, 43, 21, 12, 43);
        List<Integer> reverseList = list.stream().distinct().sorted((a, b) -> b - a).toList();
        reverseList.forEach(System.out::println);
    }
}
