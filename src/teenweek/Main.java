package teenweek;



interface Animal {
    void sound();

    default void eat() {
        System.out.println("Animal is eating");
    }
}

class  Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
    // eat 메서드는 오버라이드하지 않음

    public class Main {
    public static void main(String[] args) {
        // 이곳에 코드를 작성하세요
        Dog mydog = new Dog();
        mydog.sound();
        mydog.eat();

        Animal anydog = new Dog();
        anydog.sound();
        anydog.eat();

//        Dog anydog1 = new Animal();
//        anydog.sound();
//        anydog.eat();
    }
}
