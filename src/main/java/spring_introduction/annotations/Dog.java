package spring_introduction.annotations;

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

    @PostConstruct// init @PostConstruct выполняется после каждого создания бина, а destroy @PreDestroy не выполняется вовсе
    public void init() {
        System.out.println("Dog: init метод");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog: destroy метод");
    }
}
