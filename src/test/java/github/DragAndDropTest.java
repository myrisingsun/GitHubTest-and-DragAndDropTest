package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropTest {

    @Test
    void dragAndDropTest (){
        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b"); //перетаскиваем один элемент в другой
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

}


