package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Camilo\\IdeaProjects\\Test2\\src\\main\\resources\\chromedriver.exe");

        //Arrancar el navegador
        driver = new ChromeDriver();

        //Abrir pagina
        driver.get("https://www.imalittletester.com/");

        //Maximizar el navegador
        driver.manage().window().maximize();
    }
}