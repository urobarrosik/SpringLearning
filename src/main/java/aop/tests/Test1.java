package aop.tests;

import aop.Book;
import aop.SchoolLib;
import aop.UniLib;
import aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLib uniLib = context.getBean("uniLib", UniLib.class);
        SchoolLib schoolLib = context.getBean("schoolLib", SchoolLib.class);

        uniLib.getBook();
        uniLib.getBook("Преступление и наказание");
        uniLib.getBook(context.getBean("book", Book.class));
        uniLib.returnBook();
        uniLib.getMagazine();

        schoolLib.getBook();


        context.close();
    }
}
