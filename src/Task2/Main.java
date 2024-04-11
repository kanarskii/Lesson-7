package Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.info();

        Class classApple = Apple.class;
        Field field = classApple.getDeclaredField("color");
        field .setAccessible(true);
        field.set(apple,"Red");

        apple.info();
    }
}
