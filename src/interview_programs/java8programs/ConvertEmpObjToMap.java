package interview_programs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;

    public  Employee() {}

    public Employee(int id,String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

// converting list into the hashmap using java 8
public class ConvertEmpObjToMap {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"mahadev","IT"),
                new Employee(2,"sada","Electrical"),
                new Employee(3,"appa","Electronics")

        );

        // convert the Employee List into the hashmap where key is employee id and values is the emp object.

        Map<Integer,Employee> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId,employee -> employee));

        employeeMap.forEach((id,employee)-> System.out.println(id + " " + employee));


    }

}
