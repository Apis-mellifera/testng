package org.example.demo;

import org.testng.annotations.*;

public class Login {

    @BeforeClass
    public void executingBeforeAnyMethodInThisClass() {
        System.out.println("BeforeClass. Executed Before Any Method IN LOGIN CLASS");
    }
    @Test(dataProvider = "getData")
    public void inputLogin(String userName, String password){
        System.out.println("Input login method");
        System.out.println(userName);
        System.out.println(password);
    }

    @Parameters({"URL"})
    @Test
    public void inputPassword(String urlName){
        System.out.println("Input password method");
        System.out.println("URLName defined in xml file");
    }

    @BeforeTest
    public void cleanData() {
        System.out.println("BeforeTest xml. I will execute first: Data cleaned");
    }

    @AfterTest
    public void lastExecution() {
        System.out.println("AfterTest xml. This is Execution After Test");
    }

    @BeforeMethod
    public void executeBeforeEveryTestMethod() {
        System.out.println("BeforeMethod. This is executed before every method in Login class");
    }

    @AfterMethod
    public void executeAfterEveryTestMethod() {
        System.out.println("AfterMethod. This is executed AFTER every method in Login class");
    }

    @DataProvider
    public Object[][] getData() {
        // 1. username, password
        // 2. username, password
        // 3. username, password

        Object[][] data = new Object[3][2]; //raw, kolumn
        data[0][0] = "firstUsername";
        data[0][1] = "firstPassword";
        data[1][0] = "secondUsername";
        data[1][1] = "secondPassword";
        data[2][0] = "thirdUsername";
        data[2][1] = "secondPassword";

        return data;
    }
}
