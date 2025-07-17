package comparable_and_comparator_usecase;

import java.util.Comparator;

class SortBySalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.salary, e1.salary);
    }
}
