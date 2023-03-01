package PageObject.Cart;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {
    public SelenideElement
            Pen = $(byClassName("add_cart"),0),
            AddPenCart = $(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
            Cart = $(byClassName("cart_info")),
            CartItem = $(byClassName("cartItem")),
            ItemDelete = $(byClassName("fa-times")),
            ProductDisappears = $(byXpath("cart_section"),3),
            Continue = $(byClassName("continue")),
            DeleteItem = $(byXpath("/html/body/div[5]/div/div[4]/form/div")),

            Code = $(byText("#2/505B")),
            Color = $(byClassName("choose_color")),

            RemoveCarts = $(byText("კალათის გასუფთავება")),
            ProductName = $(byClassName("item_title")),
            ProductPrice = $(By.xpath("//div[@class='prod_price']/span"),0),
            ProductFullPrice = $(".fullPriceFor",0),
            ProductFullPrice_1 = $(".fullPriceFor",0),
            QuantityIncrease = $(byClassName("fa-plus")),
            QuantityInput = $(byClassName("inputvalue")),
            QuantityReduction = $(byClassName("fa-minus")),
            EmptyCart = $(byClassName("emptyCart"));































}
