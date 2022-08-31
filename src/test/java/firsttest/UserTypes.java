package firsttest;

import fristselenium.First;
import org.testng.annotations.*;

public class UserTypes  {
    First first = new First();
    //Runs before a test (BeforeTest runs only the first test while BeforeMethod runs all the test
    @BeforeMethod
    public void setUp(){
        first.startSession();
    }
    //Tests to run- this run in alphabetic order
    @Test(priority=1)
    public void loginAsAdmin(){
        first.adminLogin();
    }
    //Bring in a priority says where the annotation should start running from and end , start from 0(start) before priority would run firstt
    @Test
    public void loginAsManager(){
        first.managerLogin();
    }
    @Test(priority=0)
    public void loginAsTeacher(){
        first.teacherLogin();
    }
    @Test
    public void loginAsStudent(){
        first.studentLogin();
    }
    //Runs after a test
    @AfterMethod
    public void tearDown(){
        first.terminateSession();
    }
}

