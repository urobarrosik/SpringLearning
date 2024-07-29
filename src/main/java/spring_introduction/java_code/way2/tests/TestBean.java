package spring_introduction.java_code.way2.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.java_code.way2.MyConfig;
import spring_introduction.java_code.way2.Person;

public class TestBean {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.getAge() + " " + person.getName());
    }
}
