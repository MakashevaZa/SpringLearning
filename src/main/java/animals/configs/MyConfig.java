package animals.configs;

import animals.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("animals.entities")
public class MyConfig {
    /*
    @Bean
    public Cat getCat(Parrot p) {
        Cat cat = new Cat();
        cat.setName(cat.getName() + " " + p.getName() + "-killer");
        return cat;
    }
    @Bean
    public Dog getDog() {
        return new Dog();
    }
    @Bean("Small parrot")
    public Parrot getParrot() {
        return new Parrot();
    }
*/
    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }
}
