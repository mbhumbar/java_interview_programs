package interview_programs.java8programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNoArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> duplicate = new HashSet<>();
        List<Integer> duplicateNo =  list.stream().filter(n -> !duplicate.add(n)).collect(Collectors.toList());
        System.out.println(duplicateNo);
    }
}