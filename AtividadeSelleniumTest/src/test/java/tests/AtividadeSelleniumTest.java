package tests;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtividadeSelleniumTest
{

    @Test
    public void testFazerLoginUdemy(){
        System.setProperty("webdriver.chrome.driver","/Users/mateus/Downloads/chromedriver");
        WebDriver   driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.alura.com.br");
        driver.findElement(By.cssSelector(".header-barraBusca-form-serch-input")).sendKeys("Formacao c#");
        driver.findElement(By.cssSelector(".header-barraBusca-form-submit")).click();

        assertEquals("O que você quer aprender?",driver.findElement(By.cssSelector(".busca__title")).getText());
        driver.quit();
    }
}
