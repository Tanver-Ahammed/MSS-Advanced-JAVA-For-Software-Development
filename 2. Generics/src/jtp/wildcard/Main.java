package jtp.wildcard;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Rectangle>rectangle = new ArrayList<>();
        rectangle.add(new Rectangle());
        rectangle.add(new Rectangle());
        rectangle.add(new Rectangle());

        GenericClass.drawShape(rectangle);

        System.out.println();

        List<Circle>circle = new ArrayList<>();
        circle.add(new Circle());
        circle.add(new Circle());
        circle.add(new Circle());

        GenericClass.drawShape(circle);


    }
}
