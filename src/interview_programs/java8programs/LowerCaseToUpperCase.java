package interview_programs.java8programs;

// convert the string from lowercase to uppercase using map and flatmap

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "android", "kotlin", "dart");
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("hello","world"),
                Arrays.asList("java","programming")
        );

        // convert string lower case into the upper case using map
        List<String> upperCaseString = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseString);

        // convert string lower case into the upper case using the flatmap
        List<String> listofList =  listOfLists.stream().flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(listofList);

    }
}
