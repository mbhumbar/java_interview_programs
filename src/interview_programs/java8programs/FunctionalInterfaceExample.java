package interview_programs.java8programs;

@FunctionalInterface
interface FunctionalExample {
    public void print();
}


public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        FunctionalExample functionalExample = () -> {
            System.out.println("this is the functional interface...");
        };
        functionalExample.print();
    }
}
