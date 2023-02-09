package peaksoft.models;

import org.springframework.stereotype.Component;

/**
 * name : kutman
 **/
@Component("email")
public class EmailServices implements MassageServices{
    @Override
    public void getMassage() {
        System.out.println("EmailServices");
    }

    @Override
    public String toString() {
        return "Email Services";
    }
}
