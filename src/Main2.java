import java.util.List;
import java.util.ArrayList;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Integer 타입의 Box 생성
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get());

        // String 타입의 Box 생성
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World");
        System.out.println("String Value: " + stringBox.get());
    }
}
