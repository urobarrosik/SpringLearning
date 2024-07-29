package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //Сигнатура аннотации aop(! - обязательный элемент, ? - не обязательный):
    //execution!( modifiers-pattern? return-type-pattern! declaring-type-pattern?
    //method-name-pattern!(parameters-pattern)! throws-pattern?)
    //Это вариант с поиском подходящих(название начинается на get а дальше что угодно и метод возвращает void, ну и
    // модификатор public) методов во всём пакете aop
    @Before("execution(public void get*())")//(Pointcut) Перед выполнением метода getBook выполнить этот метод
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }

    //Вариант с методом с параметрами(* - 1ин любой тип параметра даже созданный нами,
    // .. - любое количество любых параметров, даже 0)
    @Before("execution(public void get*(*))")
    public void beforeGetTheBookAdvice() {
        System.out.println("beforeGetTheBookAdvice: Попытка получить конкретную книгу");
    }

    //Вариант для не стандартного параметра который мы создали сами
    @Before("execution(public void get*(aop.Book))")
    public void beforeGetCreatedTheBookAdvice() {
        System.out.println("beforeGetCreatedTheBookAdvice: Попытка получить конкретную созданную книгу");
    }

    //Это вариант, где подходящий метод может иметь любое возвращаемое значение, модификатор public и название
    //начинается на return, а дальше что угодно, и лежать это всё должно в пакете aop
    @Before("execution(public * return*())")//(Pointcut) Перед выполнением метода getBook выполнить этот метод
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
    }

}
