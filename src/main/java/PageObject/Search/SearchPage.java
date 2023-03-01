package PageObject.Search;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public SelenideElement
            Search = $(byText("პროდუქტის ძიება")),
            Search_1=$(byName("search")),
            Item_1 = $(byClassName("live-search-list"));

}
