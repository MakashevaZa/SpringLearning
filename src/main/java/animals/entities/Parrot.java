package animals.entities;

import org.springframework.stereotype.Component;

@Component("Small parrot")
public class Parrot {
    private String name = "Birdy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
