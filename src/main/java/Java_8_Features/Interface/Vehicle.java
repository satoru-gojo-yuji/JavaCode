package Java_8_Features.Interface;

public interface Vehicle {

    void cleanV();

    public default void roll()
    {
        System.out.println("Hello");
    }

}
