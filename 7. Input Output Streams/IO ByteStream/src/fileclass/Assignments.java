package fileclass;

import java.io.File;

public class Assignments {
    File file;

    public Assignments() {
        this.file = new File("IO ByteStream.iml");
        System.out.println(this.file.getTotalSpace());
        System.out.println(this.file.isDirectory());
    }
}
