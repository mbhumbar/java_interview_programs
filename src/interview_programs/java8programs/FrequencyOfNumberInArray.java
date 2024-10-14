package interview_programs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfNumberInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,12,3,4,56,78,4,5);
        Map<Integer,Long> map =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         map.forEach((key,value) -> System.out.println(key + " : "  + value));
    }
}
