package interfaceDemo.example;

public interface Father {
    void height();

    default void address() {
        System.out.println("His father is Kaitaherian.");
    }
}
