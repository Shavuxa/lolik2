package RPIS41.EMTSEV.wdad.learn.xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Calendar;


public class TestXmlTask {
    public static void test(){
        Calendar calendarEarnings = Calendar.getInstance();
        calendarEarnings.set(2015, Calendar.DECEMBER, 15);//проверка прибыли за день
        Calendar calendarRemove = Calendar.getInstance();
        calendarRemove.set(2013, Calendar.MAY, 15);// удаления 1


        try {
            XmlTask testClass = new XmlTask("src\\RPIS41\\EMTSEV\\wdad\\learn\\xml\\testXml.xml");
            System.out.println("Прибыль Петрова за 15 декабря 2015 года: " + testClass.earningsTotal("petrov", calendarEarnings));
            testClass.removeDay(calendarRemove);
            testClass.changeOfficiantName("maksim", "vorobey", "vitek", "batonov");
        }catch (ParserConfigurationException e) {e.printStackTrace();}
        catch (SAXException e) {e.printStackTrace();}
        catch (IOException e){e.printStackTrace();}
    }
}
