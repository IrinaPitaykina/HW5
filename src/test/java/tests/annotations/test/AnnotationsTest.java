package tests.annotations.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.annotations.page.WebSteps;

public class AnnotationsTest {
    private WebSteps webSteps = new WebSteps();
    TestData value = new TestData();

        @BeforeAll
        public static void fullScreen() {
            Configuration.startMaximized = true;
        }

        @Test
        public void pageIssue() {
            webSteps.openPageGitHub(value);
            webSteps.searchRepository(value);
            webSteps.openRepository(value);
            webSteps.checkIssue(value);
        }
    }

