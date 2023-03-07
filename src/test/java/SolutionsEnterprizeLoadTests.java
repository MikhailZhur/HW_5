import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsEnterprizeLoadTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = false;
    }
    @Test
    void checkLoadSolutionsPageTest(){
        open("https://github.com/");
        $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(".enterprise-hero").shouldHave(text("Build like the best"));
    }
}
