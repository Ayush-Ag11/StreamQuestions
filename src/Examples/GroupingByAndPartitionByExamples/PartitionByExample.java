package Examples.GroupingByAndPartitionByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Raj", "IT", 50000),
                new Employee("Jai", "IT", 35000),
                new Employee("Prakash", "HR", 25000),
                new Employee("Sanjay", "HR", 30000),
                new Employee("Vikas", "IT", 40000)
        );

        Map<Boolean, List<Employee>> map = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 30000));

//        map.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("\nEmployees with salary > 30000");
        map.get(true).stream().forEach(System.out::println);

        System.out.println("\nEmployees with salary < 30000");
        map.get(false).stream().forEach(System.out::println);
    }
}
