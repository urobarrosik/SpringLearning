package spring_introduction.java_code.way2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

//Данный способ не использует сканирование пакета и поиск бинов. Здесь бины описываются в конфиг классе.
//Данный способ не использует аннотацию @Autowired. Здесь зависимости прописываются вручную.
//Название метода - это bean id.
//Аннотация @Bean перехватывает все обращения к бину и регулирует его создание.
@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")//скоуп по умолчанию - singleton
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
