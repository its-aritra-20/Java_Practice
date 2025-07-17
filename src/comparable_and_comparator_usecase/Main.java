package comparable_and_comparator_usecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(104, "Amit", 30, 65000));
        list.add(new Employee(102, "Beena", 28, 72000));
        list.add(new Employee(105, "Chirag", 35, 60000));
        list.add(new Employee(101, "Deepti", 24, 50000));
        list.add(new Employee(103, "Esha", 30, 70000));

        // Sort by ID (Comparable)
        Collections.sort(list);
        System.out.println("Sorted by ID:");
        list.forEach(System.out::println);

        // Sort by Age (Comparator)
        Collections.sort(list, new SortByAge());
        System.out.println("\nSorted by Age:");
        list.forEach(System.out::println);

        // Sort by Salary (Comparator)
        Collections.sort(list, new SortBySalary());
        System.out.println("\nSorted by Salary:");
        list.forEach(System.out::println);
    }
}
