package interview_programs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstAndLastNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,34,67,43,67,89,34);
        Optional<Integer> firstElement = list.stream().findFirst();
        System.out.println(firstElement);
    }
}
