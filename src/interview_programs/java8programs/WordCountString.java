package interview_programs.java8programs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountString {

    public static void main(String[] args) {
        String input = "java in java";
        // Using Stream API to count repeated words
        Map<String, Long> wordCount = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        // print each word and its count
        wordCount.forEach((word,count) -> System.out.println(word + " " + count));
    }
}
