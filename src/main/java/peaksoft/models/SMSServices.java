package peaksoft.models;

import org.springframework.stereotype.Component;

/**
 * name : kutman
 **/
@Component("sms")
public class SMSServices implements MassageServices{
    @Override
    public void getMassage() {
        System.out.println("SMSServices");
    }

    @Override
    public String toString() {
        return "SMS Services";
    }
}
