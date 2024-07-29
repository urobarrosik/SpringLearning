package spring_introduction.java_code.way2;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog: Создали бин собаки");
    }

    public void say() {
        System.out.println("Dog: Гав-гав");
    }


    public void init() {
        System.out.println("Dog: init метод");
    }


    public void destroy() {
        System.out.println("Dog: destroy метод");
    }
}
