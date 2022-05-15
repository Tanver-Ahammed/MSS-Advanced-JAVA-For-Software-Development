package objectstream;

import java.io.*;

public class ObjectStreams {

    ObjectInputStream objectInputStream;

    ObjectOutputStream objectOutputStream;

    public ObjectStreams() {
        try {
            this.objectOutputStream= new ObjectOutputStream(new FileOutputStream("object_file.xyz"));

            this.objectInputStream = new ObjectInputStream(new FileInputStream("object_file.xyz"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeObject() {
        Student s1 = new Student(19016,"Tanver",20,360);
        Student s2 = new Student(19017,"Sheuly",21,320);
        Student s3 = new Student(19018,"Tariq",23,350);
        Student s4 = new Student(19019,"Bonna",22,370);

        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        Manager m4 = new Manager();

        try {
            this.objectOutputStream.writeObject(s1);
            this.objectOutputStream.writeObject(m1);
            this.objectOutputStream.writeObject(s2);
            this.objectOutputStream.writeObject(m2);
            this.objectOutputStream.writeObject(s3);
            this.objectOutputStream.writeObject(m3);
            this.objectOutputStream.writeObject(s4);
            this.objectOutputStream.writeObject(m4);

            this.objectOutputStream.close();

            for(int i=0; i < 4; i++) {
                Student s = (Student) this.objectInputStream.readObject();
                Manager m = (Manager) this.objectInputStream.readObject();

                System.out.println(s.toString());
                m.callForMeeting();

            }
            this.objectInputStream.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
