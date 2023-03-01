package StepObject.Search;

import PageObject.Search.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import java.time.Duration;

public class SearchStep extends SearchPage {
    @Step("search")
    public SearchStep SearchClick (){
        Search.click();
        return this;
    }

    @Step("search Item კალამი ბურთულიანი")
    public SearchStep SearchItem (String Item){
        Search_1.setValue(Item);
        return this;

    }
    @Step("search Item კალამი ბურთულიანი")
    public SearchStep SearchItemPressEnter () {
        Search_1.pressEnter();
        return this;
    }
    @Step("Search Item Negative")
    public SearchStep searchItem_1 (String Item_1){
        Search_1.setValue(Item_1);
        Search_1.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
}
