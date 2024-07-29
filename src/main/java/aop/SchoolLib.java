package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLib {

    public void getBook() {
        System.out.println("SchoolLib: Берём книгу");
    }
}
