package frompythontojava.exercise3;

import java.util.UUID;

/**
 * Created by levente on 2017.01.05..
 */
public class User {

    private UUID id;

    public User() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String toString() { return String.format("User id: %s", this.getId());}
}
