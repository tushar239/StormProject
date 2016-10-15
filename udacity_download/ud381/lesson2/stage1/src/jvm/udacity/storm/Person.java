package udacity.storm;

import java.io.Serializable;

/**
 * @author Tushar Chokshi @ 8/21/16.
 */
public class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
