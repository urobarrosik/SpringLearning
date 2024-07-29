package spring_introduction.xml_file;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat: Создали бин кота");
    }

    @Override
    public void say() {
        System.out.println("Cat: Мяу-мяу");
    }
}
