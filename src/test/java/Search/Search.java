package Search;

import PageObject.Search.SearchPage;
import StepObject.Search.SearchStep;
import Ultils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static DataObject.DataItem.DataItem.Item;
import static DataObject.DataItem.DataItem.Item_1;

public class Search extends ChromeRunner {
    @Test (priority = 0)
    @Description("Case 1 Positive check in search")
    public void Search (){
        SearchStep step = new SearchStep();
        step.SearchClick();
        Assert.assertTrue(step.Search.is(Condition.visible));
    }
    @Test (priority = 2)
    @Description("Case 2 Positive check in item")
    public void SearchItem (){
        SearchStep Step = new SearchStep();
        SearchPage search = new SearchPage();
        Step.SearchClick()
            .SearchItem(Item);
        Assert.assertEquals(search.Search_1.getValue(),"კალამი ბურთულიანი", "Item");
    }
    @Test (priority = 3)
    @Description("Case 3 Negative Check in item")
    public void SearchItem1 (){
        SearchStep Step = new SearchStep();
        SearchPage search = new SearchPage();
        Step.SearchClick()
            .SearchItem(Item_1);
        Assert.assertEquals(Step.Search_1.getValue(),"satesto", "satesto");
        search.Item_1.shouldBe(Condition.visible, Duration.ofMillis(1000));
        Assert.assertTrue(search.Item_1.is(Condition.visible),"test");

    }
}

