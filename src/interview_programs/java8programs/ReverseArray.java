package interview_programs.java8programs;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {

        List<Integer> list  = Arrays.asList(32,45,67,89,32,44,78,12);
        List<Integer> reverse =  list.stream().distinct().sorted((a,b) -> b - a).toList();
        reverse.forEach(System.out::println);

    }

}
