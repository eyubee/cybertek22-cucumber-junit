package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /** creating a private constructor so this class object isn't accessible from outside
     * */
    private Driver(){

    }
    private static ThreadLocal<WebDriver> driverPool= new ThreadLocal<>();


    /** making our driver instance private so that it isn't reachable from outside of the class
     * we make it static becuase we want it to run before everything else and also we will be able to use it in static method */
    public static WebDriver getDriver(){
        if (driverPool.get()== null) {
            synchronized (Driver.class) {


                /** we are reading our browser type from configuratuion.properties file using .getProperty method we created in that class*/
                String brosertType = ConfigurationReader.getProperty("browser");
                /** depending on the type of the browser, the switch statment will determine to open specific type of browser/ driver */
                switch (brosertType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                }
            }
        }
        /** same driver instance will be returned everytime we call driver.getdriver(); method */
        return driverPool.get();

    }
    /**this methos makes sure we have some form of driver session or driver id has either null or not null must exist */
    public static void closeDriver(){
        if(driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
