package spring_introduction.annotations.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.annotations.Cat;
import spring_introduction.annotations.Dog;

public class TestScope {
    public static void main(String[] args) {

        //Создаём спринг контейнер и сразу же создаются все бины со скоупом singleton
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        //Создаём два бина собаки
        Dog dog1 = context.getBean("dogBean", Dog.class);
        Dog dog2 = context.getBean("dogBean", Dog.class);

        //Проверяем ссылки бинов на равенство
        Cat cat1 = context.getBean("catBean", Cat.class);
        Cat cat2 = context.getBean("catBean", Cat.class);

        System.out.println("Равны ли ссылки бинов со скоупом prototype : " + (dog1==dog2));
        System.out.println("Равны ли ссылки бинов со скоупом singleton : " + (cat1==cat2));

        context.close();

    }
}
