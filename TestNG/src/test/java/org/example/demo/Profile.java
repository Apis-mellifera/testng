package org.example.demo;

import org.testng.annotations.Test;

public class Profile {

    @Test
    public void fillProfile() {
        System.out.println("Fill up Profile method");
    }

    @Test(groups = {"Smoke"})
    public void addSection() {
        System.out.println("Add section method");
    }

    @Test(enabled = false)
    public void addText() {
        System.out.println("Add text method");
    }
}
