

/**
 * Created by Администратор on 30.04.2017.
 */




import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.remote.DesiredCapabilities;


public class FirstTest {




    public static void main (String[] args) throws MalformedURLException
    {

        DesiredCapabilities c = new DesiredCapabilities();
        c.setCapability("deviceName", "24ece61a");
        c.setCapability("platformName", "Android");
        c.setCapability("app", "C:\\Appium\\InstalledAppium\\Appium\\node_modules\\appium\\build\\unlock_apk\\unlock_apk-debug.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), c);
        driver.pressKeyCode(AndroidKeyCode.HOME);
      // WebElement searchButton = driver.findElement(By.className( "\"android.widget.TextView\").index(2)"));
      //  searchButton.click();
      //  androidDriver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").index(0)");



        MobileElement fieldOne = (MobileElement) driver.findElementByAccessibilityId("Приложения");
        fieldOne.click();
       // driver.findElementByAndroidUIAutomator(new UiSelector().className("android.widget.TextView").index(10));

        MobileElement el1 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Калькулятор\")");
        el1.click();


        MobileElement el2 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Удалить\")");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"2\")");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"+\")");
        el4.click();

        el3.click();
        MobileElement el5 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"=\")");
        el5.click();




        MobileElement el6 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"4\")");
        




        driver.quit();
    }
}




