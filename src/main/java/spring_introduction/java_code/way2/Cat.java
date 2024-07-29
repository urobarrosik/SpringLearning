package spring_introduction.java_code.way2;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat: Создали бин кота");
    }

    public void say() {
        System.out.println("Cat: Мяу-мяу");
    }

    public void init() {
        System.out.println("Cat: init метод");
    }

    public void destroy() {
        System.out.println("Cat: destroy метод");
    }
}
