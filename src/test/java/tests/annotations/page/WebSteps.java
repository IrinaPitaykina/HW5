package tests.annotations.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tests.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step ("Перейти в GitHub")
    public void openPageGitHub(TestData value) {
        open(value.getUrl());
    }

    @Step ("Найти указанный репозиторий")
    public void searchRepository (TestData value) {
        $("[data-scoped-placeholder = Search]").setValue(value.getRepository()).pressEnter();
    }

    @Step ("Перейти в указанный репозиторию")
    public void openRepository (TestData value) {
        $(By.linkText(value.getRepository())).click();
    }

    @Step ("Проверить наличие Issue")
    public void checkIssue (TestData value) {
        $("[data-tab-item = i1issues-tab]").shouldHave(text(value.getCheckValue()));
    }
}
