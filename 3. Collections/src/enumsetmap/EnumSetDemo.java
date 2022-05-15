package enumsetmap;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDemo {

    public enum siNo {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {
        Set<siNo> set = EnumSet.allOf(siNo.class);
        System.out.println(set);
    }
}
