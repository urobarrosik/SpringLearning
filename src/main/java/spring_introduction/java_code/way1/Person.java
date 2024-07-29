package spring_introduction.java_code.way1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Разницы между аннотацией @Autowired поля конструктора и метода особо нет, выбираем любой способ
//Но для конструктора аннотация @Qualifier имеет особый синтаксис
//Если проставить @Autowired всем трём способам заполнения 1ого и того же поля, то будет что-то странное

@Component("personBean")//Если не указать в скобках бин id, то он будет присвоен автоматически: Person -> person
@Scope("prototype")//Указываем скоуп. Если не указать, то по умолчанию задаётся singleton
public class Person {

    //@Autowired //Можно использовать без @Qualifier только если подходящих классов для заполнения поля ровно 1
    //@Qualifier("dogBean") // Добавляем если подходящих классов больше чем 1 и нужно выбрать конкретный
    private Pet pet;

    public Person() {
        System.out.println("Person: Создали бин персоны");
    }

    @Autowired //Можно использовать без @Qualifier только если подходящих классов для заполнения поля ровно 1
    public Person(@Qualifier("dogBean") Pet pet) { //Особый синтаксис аннотации для конструктора
        this.pet = pet;
        System.out.println("Person: Создали бин персоны c DI для поля pet через конструктор");
    }

    public void collYourPet() {
        System.out.println("Person: Привет мой питомец!");
        pet.say();
    }

    //@Autowired //Можно использовать без @Qualifier только если подходящих классов для заполнения поля ровно 1
    //@Qualifier("dogBean") // Добавляем если подходящих классов больше чем 1 и нужно выбрать конкретный
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Person: Создали бин персоны c DI для поля pet через сеттер");
    }
}
