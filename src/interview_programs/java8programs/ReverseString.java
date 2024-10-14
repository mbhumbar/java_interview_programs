package interview_programs.java8programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {

        String str = "welcome";
       char[] c = str.toCharArray();
       IntStream.range(0,c.length).mapToObj(i -> c[(c.length-1) - i])
               .forEach(System.out::print);


    }

}
