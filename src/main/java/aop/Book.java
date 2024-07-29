package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Трое в лодке не считая собаки")
    private String name;

    public String getName() {
        return name;
    }
}
