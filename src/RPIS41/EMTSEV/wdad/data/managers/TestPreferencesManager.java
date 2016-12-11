package RPIS41.EMTSEV.wdad.data.managers;

        import org.xml.sax.SAXException;

        import javax.xml.parsers.ParserConfigurationException;
        import java.io.IOException;

/**
 * Created by molish on 09.10.2016.
 */
public class TestPreferencesManager {
    public static void test(){
        try {
            PreferencesManager preferencesManager = PreferencesManager.getInstance();

            System.out.println(preferencesManager.isCreateRegistry());
            System.out.println(preferencesManager.getUseCodeBaseOnly());
            System.out.println(preferencesManager.getClassProvider());
            System.out.println(preferencesManager.getPolicyPath());
            System.out.println(preferencesManager.getRegistryAddress());
            System.out.println(preferencesManager.getRegistryPort());

            preferencesManager.setPolicyPath("fsd\\gdf\\kek\\lol\\pip\\sdf\\checkSum.policy");
            preferencesManager.setClassProvider("C:\\edw\\wek\\ter\\client.jar");
            preferencesManager.setRegistryAddress("8.800.555.35.35");

            /*preferencesManager.setPolicyPath("client.policy");
            preferencesManager.setRegistryAddress("localhost");
            preferencesManager.setClassProvider("http://www.yourhost.free.ru/cp/cp.jar");*/

        }catch (IOException | ParserConfigurationException | SAXException e){e.printStackTrace();}
    }
}