package com.arabamcom.base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver = new ChromeDriver();

    @BeforeScenario
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--kiosk");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver = new ChromeDriver(options);
    }


    @AfterScenario
    public void tearDown() {
        driver.quit();

    }

}