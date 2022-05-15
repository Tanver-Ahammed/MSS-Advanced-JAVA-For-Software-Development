package list.algorithms.equalsMethods;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Age: %d\n",getId(),getName(),getAge());
        return display;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, age);
//    }

    @Override
    public int compareTo(Student student) {
        if (this.getId() > student.getId()) {
            return 1;
        }else if (this.getId() < student.getId()) {
            return -1;
        }
        return 0;
    }
}
