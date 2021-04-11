package tests.lambda.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.lambda.page.LambdaPage;

import static io.qameta.allure.Allure.step;

public class LambdaTest {
    @BeforeAll
    static void fullScreen() {
        Configuration.startMaximized = true;
    }

    @Test
    void pageIssue() {
        TestData value = new TestData();
        step ("Перейти на GitHub", () -> {
            LambdaPage.openPageGitHub(value);
        }) ;
        step ("Найти указанный репозиторий", () -> {
            LambdaPage.searchRepository(value);
        }) ;
        step ("Перейти к указанному репозиторию", () -> {
            LambdaPage.openRepository(value);
        }) ;
        step ("Проверить наличие Issue", () -> {
            LambdaPage.checkIssue(value);
        }) ;

    }
}
