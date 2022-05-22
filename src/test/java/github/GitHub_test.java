package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GitHub_test {

    @Test
    void findGitHubRepo () {
        // - Откройте страницу Selenide в Github
        Selenide.open("http://www.github.com");
        $("[data-test-selector='nav-search-input']").setValue("Selenide").pressEnter();
        // Перейдите в раздел selenide / selenide
        $$("ul.repo-list li").first().$("a").click(); //выбор списка, далее выбор первого элемента, далее клие по ссылке (по умолчанию клик происходит по центру выбранного элемента)
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").click(); //клик по элементу Button
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // Откройте страницу SoftAssertions
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        // проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5"));


        //ДЛЯ ИНФО - Общая струкутра теста
        //ARRANGE (GIVEN) - подготовка
        //ACT (WHEN) - действие
        //ACT (WHEN) - действие
        //ACT (WHEN) - действие
        //ASSERT (THEN)  - проверка
        //Могут быть промежуточные ASSERTS для проверок

    }

}
