package spring_introduction.java_code.way1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
@Scope("singleton")//Указывать не обязательно, так как и так по умолчанию
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat: Создали бин кота");
    }

    @Override
    public void say() {
        System.out.println("Cat: Мяу-мяу");
    }

    @PostConstruct//init @PostConstruct выполняется после создания, а destroy @PreDestroy после закрытия контейнера
    public void init() {
        System.out.println("Cat: init метод");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat: destroy метод");
    }
}
