package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Homepage {

    WebDriver driver = DriverManager.getDriver();

    public CoursesPage clickOnCourse( String courseName){

      //  driver.findElement(coursesBy).click();
        return new CoursesPage();
    }

}
