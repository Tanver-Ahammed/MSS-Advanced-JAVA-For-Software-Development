package map.sort;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Integer age;
    private Integer score;

    public Student(Integer id, String name, Integer age, Integer score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        String display = String.format("Id: %d , Name: %s , Age: %d , Score: %d",
                this.getId(),this.getName(),this.getAge(),this.getScore());
        return display;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, score);
    }

    @Override
    public int compareTo(Student student) {
        if (this.getScore() == student.getScore()) {
            if (this.getName().compareTo(student.getName()) > 0) {
                return 1;
            } else if (this.getName().compareTo(student.getName()) < 0) {
                return -1;
            }
            else
                return 0;
        } else {
            if (this.getScore() < student.getScore()) {
                return 1;
            }
            else if (this.getScore() > student.getScore()){
                return -1;
            }
            else
                return 0;
        }
    }
}
