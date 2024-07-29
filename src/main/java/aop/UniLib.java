package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLib {

    public void getBook() {
        System.out.println("UniLib: Берём книгу");
    }

    public void getBook(String bookName) {
        System.out.println("UniLib: Берём книгу " + bookName);
    }

    public void getBook(Book book) {
        System.out.println("UniLib: Берём книгу " + book.getName());
    }

    public String returnBook() {
        System.out.println("UniLib: Возвращаем книгу");
        return "12345";
    }

    public void getMagazine() {
        System.out.println("UniLib: Берём журнал");
    }
}
