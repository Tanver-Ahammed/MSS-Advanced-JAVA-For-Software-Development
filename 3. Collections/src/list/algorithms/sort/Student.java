package list.algorithms.sort;

public class Student implements Comparable<Student> {
    private int id, score, age;
    private String name;

    public Student(int id, int score, int age, String name) {
        this.id = id;
        this.score = score;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Age: %d,Score: %d\n",
                this.getId(), this.getName(), this.getAge(), this.getScore());

        return display;
    }

//    @Override      //Sorting by Id (Ascending order)
//    public int compareTo(Student student) {
//        if (this.getId() > student.getId()) {
//            return 5;
//        } else if(this.getId() < student.getId()) {
//            return -7;
//        }
//        return 0;
//    }

//    @Override      //Sorting by Name (Ascending order)
//    public int compareTo(Student student) {
//        if (this.getName().compareToIgnoreCase(student.getName()) > 0) {
//            return 1;
//        } else if (this.getName().compareToIgnoreCase(student.getName()) < 0) {
//            return -1;
//        }
//        return 0;
//    }


    @Override       // Advanced sorting system
    public int compareTo(Student student) {
        if (this.getScore() == student.getScore()) {
            if (this.getName().compareToIgnoreCase(student.getName()) > 0) {
                return 1;
            } else if (this.getName().compareToIgnoreCase(student.getName()) < 0){
                return -1;
            }
            return 0;
        } else {
            if (this.getScore() < student.getScore()) {
                return 1;
            } else if (this.getScore() > student.getScore()) {
                return -1;
            }
            else
                return 0;
        }
    }
}
