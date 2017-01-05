package frompythontojava.exercise3;

import java.util.List;

/**
 * Created by levente on 2017.01.05..
 */
public class Receipt {

    private List<String> details;

    public void addDeatils(String details) {
        this.details.add(details);
    }
    
    public String toString() {
        System.out.println("Following details been found:");
        for (String detail: this.details) {
            System.out.println(detail);
        }
        return "Details ended";
    }
}
