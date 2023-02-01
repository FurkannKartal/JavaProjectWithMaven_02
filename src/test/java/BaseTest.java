import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)      //we can use this annotation to make the test class as singleton
public class BaseTest {                      //we can use this class as a base class for all test classes
    WebDriver driver;        //invoke driver

    @BeforeAll                   //this method will be executed before all test methods
    public void setup() {               //we can use this method to setup the test
        System.out.println("Setup");
        WebDriverManager.chromedriver().setup();       //invoke chrome driver
        driver.get("https://www.amazon.com/");        //open URL
        driver.manage().window().maximize();           //maximize the window

    }

    @AfterAll                    //this method will be executed after all test methods
    public void tearDown() {            //we can use this method to close the test
        System.out.println("Tear Down");
        driver.quit();              //close the driver
    }
}