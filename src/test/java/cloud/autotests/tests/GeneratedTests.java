package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("test hh")
    void generatedTest() {
        step("Open 'https://hh.ru/vacancy/55442983?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=qa'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://hh.ru/vacancy/55442983?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=qa'", () ->
            open("https://hh.ru/vacancy/55442983?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=qa"));

        step("Page title should have text 'Вакансия QA automation / AQA в Москве, работа в компании Системы Распределенного Реестра'", () -> {
            String expectedTitle = "Вакансия QA automation / AQA в Москве, работа в компании Системы Распределенного Реестра";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://hh.ru/vacancy/55442983?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=qa'", () ->
            open("https://hh.ru/vacancy/55442983?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=qa"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}