package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverFactory;
import java.net.MalformedURLException;
import static org.junit.Assert.assertEquals;

public class DemoHealthCareAppTests {
    HomePage homepage;

    @Given("User navigates to the Health App")
    public void User_navigates_to_the_Health_App() throws InterruptedException, MalformedURLException {
        homepage = new HomePage(DriverFactory.getDriver());
    }

    @When("User clicks on next page")
    public void User_clicks_on_next_page() {
        homepage.tapNextButton();
    }

    @Then("App successfully redirects to the content page")
    public void App_successfully_redirects_to_the_content_page() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals("Search & find \n" +
                "thousands of patients \n" +
                "with hypertension", homepage.getInfoText1());

        assertEquals("Maintain records of \n" +
                "blood pressures \n" +
                "& medicines", homepage.getInfoText2());

    }
}
