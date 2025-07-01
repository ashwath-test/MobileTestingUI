package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"org.simple.clinic.staging:id/nextButton\"]")
    private WebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"org.simple.clinic.staging:id/introOneTextView\"]")
    private WebElement infoText1;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"org.simple.clinic.staging:id/introTwoTextView\"]")
    private  WebElement infoText2;

    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public void tapNextButton(){
        nextButton.click();
    }

    public String getInfoText1(){
    return infoText1.getText();
    }

    public String getInfoText2(){
        return infoText2.getText();
    }

}
