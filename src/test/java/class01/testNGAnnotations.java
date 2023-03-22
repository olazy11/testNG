package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//follows alphabetical order in execution
public class testNGAnnotations {
    @Test
    public void aFirstTestCase(){
        System.out.println("I am the 1st test case");
    }
    @Test
    public void bSecondTestCase (){
        System.out.println("I am the 2nd test case");
    }
    @Test
    public void cThirdTestCase(){
        System.out.println("I am the 3rd test case");
    }
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("I am a Before Method");
    }
    @AfterMethod
    public void afterMethods (){
        System.out.println("I am an After Method");
    }
}
