
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Akshit", 3.9));
        list.sort(null);
        System.out.println(list);
    }

}

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    double getGpa() {
        return gpa;
    }

    String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override // It works like this.compareTo(Student o)
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
        // This will give type error as gpa is double and return is int // return
        // o.getGpa()-this.getGpa(); // Write logic here (Single logic not like
        // Comparator which can have multiple
        // field sort/order)

    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }

}