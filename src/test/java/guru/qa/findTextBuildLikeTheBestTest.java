package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class findTextBuildLikeTheBestTest {

    @Test
    void findTextTest(){

        open("https://github.com/");

        $(byText("Solutions")).hover();

        $(byText("Enterprise")).click();

        $(".application-main h1").shouldHave(text("Build like the best"));


    }
}
