package org.example.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
@Parameters({"URL"})
    @Test
    public void demo(String urlMainPageName){
        System.out.println("Demo Hello method");
        System.out.println(urlMainPageName);
    }

    @Test
    public void bye() {
        System.out.println("Bye method");
    }
}
