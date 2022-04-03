package pe.com.bcp.techcases.testautomation.ui.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import pe.com.bcp.techcases.testautomation.ui.actors.DefaultUser;

import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;


public class StepDefinitions {

    @Steps
    DefaultUser jhon;

    @ParameterType(".*")
    public DefaultUser user(String user) {
        try {
            return (DefaultUser) Class.forName("pe.com.bcp.techcases.testautomation.ui.actors." + user)
                    .getConstructor().newInstance();
        } catch (ClassNotFoundException
                | NoSuchMethodException
                | IllegalAccessException
                | InstantiationException
                | IllegalArgumentException
                | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("a {user}")
    public void a(DefaultUser user) {
    }

    @ParameterType(".*")
    public Class<PageObject> page(String pageName) {
        try {
            return (Class<PageObject>) Class.forName("pe.com.bcp.techcases.testautomation.ui.pages." + pageName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @When("visits {page}")
    public void visits(Class<PageObject> page) {
        jhon.goToPage(page);
    }

    @And("clicks on {string}")
    public void clicksOn(String elementName) throws IllegalAccessException {
        jhon.clicksOn(elementName);
    }

    @And("fills {string} with {string}")
    public void fillsWith(String field, String value) throws IllegalAccessException {
        jhon.fillsField(field, value);
    }

    @Then("The Page says {string}")
    public void thePageSays(String text) throws IllegalAccessException {
        assertThat(jhon.isAbleToSee(text)).isTrue();
    }
}
