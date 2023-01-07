package app.model;

import app.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    public AnimalsCage(@Qualifier("dog") Animal animal, @Qualifier("timer") Timer time) {

        this.animal = animal;
        this.time = time;
    }

    private final Animal animal;
    private final Timer time;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
//        System.out.println();
        System.out.println(time.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
}
