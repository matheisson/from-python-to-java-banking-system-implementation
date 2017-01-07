package frompythontojava.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levente on 2017.01.05..
 */
public class Receipt {

    private List<String> details;

    public Receipt(){this.details = new ArrayList<>();}

    public void addDeatils(String details) {
        this.details.add(details);
    }
    
    public String toString() {
        System.out.println("<-R-E-C-E-I-P-T->\nFollowing details been found:\n");
        for (String detail: this.details) {
            System.out.println(detail+"\n");
        }
        return "Details ended\n<>---------<>";
    }
}
