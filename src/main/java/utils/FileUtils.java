package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static void takeScreenshot(RemoteWebDriver  driver, String fileName){
        File source = driver.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + String.format("/Logs/%s.png",fileName);
        try {
            org.apache.commons.io.FileUtils.copyFile(source,new File(destinationFile));
        } catch (IOException e) {
            System.out.println("Nu s-a putut efectua screenshotul");
            e.printStackTrace();
        }
    }
}
