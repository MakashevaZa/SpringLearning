package animals;

import animals.configs.MyConfig;
import animals.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("Small parrot", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
