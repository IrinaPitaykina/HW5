package tests.selenide.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.selenide.page.IssuePage;

public class IssueTest {
    @BeforeAll
    static void fullScreen() {
        Configuration.startMaximized = true;
    }

    @Test
    void pageIssue() {
        TestData testData = new TestData();
        IssuePage.openPageGitHub(testData);
        IssuePage.searchRepository(testData);
        IssuePage.openRepository(testData);
        IssuePage.checkIssue(testData);

    }
}
