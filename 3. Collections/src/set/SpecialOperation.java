package set;

import java.util.LinkedHashSet;

public class SpecialOperation {
    public static void main(String[] args) {

        LinkedHashSet<Integer> squares = new LinkedHashSet<>();
        LinkedHashSet<Integer> cubes = new LinkedHashSet<>();

        for (int i = 0; i < 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("Square size: " + squares.size());
        System.out.println("Cubes size: " + cubes.size());

        LinkedHashSet<Integer> union = new LinkedHashSet<>(squares);
        union.addAll(cubes);

        System.out.println("Square union cube size: " + union.size());

        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(squares);

        intersection.retainAll(cubes);

        for (Integer num : intersection) {
            System.out.printf("%4d Square of %3d cube of %2d.\n",num,(int)Math.sqrt(num),(int)Math.cbrt(num));
        }



    }
}
