package peaksoft;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.SpringConfig;
import peaksoft.models.MassagePrinter;
import peaksoft.models.MassageServices;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MassagePrinter massagePrinter = context.getBean("massagePrinter", MassagePrinter.class);
        massagePrinter.getMassageServices().getMassage();
        MassageServices sms = context.getBean("sms", MassageServices.class);
        System.out.println(sms);


    }
}
