import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoJenkinsJobs {
    WebDriver driver;

    @Test
    public  void testJenkins() throws Exception {
        System.out.println("Welcome to Jenkins...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/sdeliyar/Jenkins_Demo");
        System.out.println("Github website opened...");
        System.out.println("Test passed, this is Jenkins with Maven...");
           // returnWithoutFirstAndLastChar("hr");
        driver.close();
        driver.quit();
     }

     public void returnWithoutFirstAndLastChar(String word) throws Exception {
        if (word.length()<2){
            throw new  Exception("the word should be at least two characters...");
        }
        String[] eachWord = word.split("");
        String FinalWord = "";
        for (int i = 1;i<=eachWord.length;i++){
            if(i!=1 && i!=eachWord.length ){
                FinalWord = FinalWord + eachWord[i];
            }
        }
         System.out.println(FinalWord);
     }
}
