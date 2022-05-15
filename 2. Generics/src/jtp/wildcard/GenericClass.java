package jtp.wildcard;

import java.util.List;

public class GenericClass {
    public static void drawShape(List<? extends Shape>list){
        for (Shape shape : list) {
            shape.draw();
        }
    }
}
