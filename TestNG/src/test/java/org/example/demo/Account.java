package org.example.demo;

import org.testng.annotations.*;

public class Account {
//metoda "insertFile" wykona się przed "accountMobile"
    @Test(dependsOnMethods = {"insertFile"})
    public void accountMobile() {
        System.out.println("Account Mobile method");
    }

    @Parameters({"URL", "APIKey"})
    @Test
    public void insertFile(String urlAccountName, String key) {
        System.out.println("Insertion file method");
        System.out.println(urlAccountName);
        System.out.println(key);
    }

    @Test
    public void accountWeb() {
        System.out.println("Account Web method");
    }

    @BeforeSuite
    public void executeBeforeSuite() {
        System.out.println("Execution Before Suite");
    }

    @AfterSuite
    public void executeAfterSuite() {
        System.out.println("Execution After Suite");
    }
}
