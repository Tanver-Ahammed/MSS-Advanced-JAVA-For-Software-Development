package map.hashmap;

public class Student {
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

    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Age: %d , Score: %d\n",
                getId(),getName(),getAge(),getScore());
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


}
