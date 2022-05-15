package map.treemap;

public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Age: %d\n",
                getId(),getName(),getAge());
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


    @Override
    public int compareTo(Student student) {
        if (this.getAge() > student.getAge()) {
            return 1;
        }
        else if (this.getAge() < student.getAge()) {
            return -1;
        }
        return 0;
    }
}
