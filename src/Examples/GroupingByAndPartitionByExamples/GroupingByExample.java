package Examples.GroupingByAndPartitionByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Raj", "IT"),
                new Employee("Jai", "IT"),
                new Employee("Prakash", "HR"),
                new Employee("Sanjay", "HR"),
                new Employee("Vikas", "IT")
        );

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        map.forEach(
                (key, value) -> {
                    System.out.println("Department: " + key);
                    value.forEach(System.out::println);
                });
    }
}
