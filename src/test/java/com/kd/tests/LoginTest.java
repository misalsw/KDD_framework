package com.kd.tests;

import com.kd.engine.KeywordEngine;
import org.testng.annotations.Test;


public class LoginTest {
    public KeywordEngine keywordEngine;

    @Test
    public void loginTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("login");
    }

    @Test
    public void signUpTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("signup");
    }
}
