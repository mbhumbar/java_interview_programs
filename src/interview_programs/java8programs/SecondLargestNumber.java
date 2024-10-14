package interview_programs.java8programs;

// find out the second-largest number in the array.


import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestNumber {

    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(12,32,42,12,34,50);

        Optional<Integer> secondHighest = arrayList.stream().sorted().skip(arrayList.size() -2).findFirst();

        if (secondHighest.isPresent()) {
            System.out.println("get the second highest number from the list:" + secondHighest);
        }

    }

}
