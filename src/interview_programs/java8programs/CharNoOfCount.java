package interview_programs.java8programs;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharNoOfCount {

    public static void main(String[] args) {
        String str = "welcome";
        Map<Character,Long> hashmap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        hashmap.forEach((key,value) -> {
            System.out.println(  key + "-" + value);
        });

    }


}
