package hooks;

import io.cucumber.java.*;
import steps.BaseSteps;

import javax.sql.rowset.BaseRowSet;

public class CustomHooks extends BaseSteps {

    @Before
    public void beforeScenario(Scenario scenario){
        initializeDriver();
    }

    @After
    public void afterScenario(Scenario scenario){
        boolean status = scenario.isFailed();
        System.out.println("Scenario is Failed? " + status);
        quitDriver();
    }

    @BeforeStep
    public void beforeStep(Scenario scenario){


    }

    @AfterStep
    public void afterStep(Scenario scenario){

    }
}
