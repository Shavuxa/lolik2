package RPIS41.EMTSEV.wdad;

import RPIS41.EMTSEV.wdad.data.managers.TestPreferencesManager;
import RPIS41.EMTSEV.wdad.learn.xml.TestXmlTask;


public class Application {
    public static void main(String[] args) {
        TestXmlTask.test();
        System.out.println("POESH PLOV");
        TestPreferencesManager.test();
    }
}
