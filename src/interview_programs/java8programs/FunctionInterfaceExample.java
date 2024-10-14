package interview_programs.java8programs;

import java.util.function.Consumer;
import java.util.function.Function;

/***
 * 1. what is the Function Interface?
 *
 * Function Interface in the functional interface which is having only single method
 * method name : apply
 */


public class FunctionInterfaceExample {
    public static void main(String[] args) {

        // 1. Function<T,R>
        Function<String,Integer> stringLength = String::length;
        System.out.println("Length of the Hello " + stringLength.apply("Hello"));
        System.out.println("length of functional interface "  + stringLength.apply("Function Interface"));

        // 2. Consumers<T>
        Consumer<String> print = System.out::println;
        print.accept("Hello World");
        print.accept("Welcome to the functional Programming...");




    }
}
