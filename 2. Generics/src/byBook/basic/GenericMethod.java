package byBook.basic;

import java.util.Objects;
import java.util.function.IntFunction;

public class GenericMethod<T> {

    private static <T> void setAll(T[]array, IntFunction<? extends T> generator) {
        Objects.requireNonNull(generator);
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.apply(i);
        }
    }
}
