package peaksoft.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * name : kutman
 **/
@Component
public class MassagePrinter {


    private MassageServices massageServices;
    @Autowired
    public MassagePrinter(@Qualifier("sms") MassageServices massageServices) {
        this.massageServices = massageServices;
    }

    public MassageServices getMassageServices() {
        return massageServices;
    }

    public void setMassageServices(MassageServices massageServices) {
        this.massageServices = massageServices;
    }

    @Override
    public String toString() {
        return "MassagePrinter{" +
                "massageServices=" + massageServices +
                '}';
    }

}
