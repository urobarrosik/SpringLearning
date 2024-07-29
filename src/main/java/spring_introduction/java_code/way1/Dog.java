package spring_introduction.java_code.way1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog: Создали бин собаки");
    }

    @Override
    public void say() {
        System.out.println("Dog: Гав-гав");
    }

    @PostConstruct//для скоупа prototype init @PostConstruct выполняется после каждого создания бина
    public void init() {
        System.out.println("Dog: init метод");
    }

    @PreDestroy//а destroy @PreDestroy не выполняется вовсе
    public void destroy() {
        System.out.println("Dog: destroy метод");
    }
}
