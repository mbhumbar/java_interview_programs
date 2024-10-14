package interview_programs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,34,23,56,77,88,90);
        Optional<Integer> maxNumber =  list.stream().min(Integer::compareTo);
        maxNumber.ifPresent(value -> System.out.println("The maximum number is: " + value));
    }
}
