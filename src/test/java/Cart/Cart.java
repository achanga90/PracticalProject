package Cart;

import PageObject.Cart.CartPage;
import StepObject.Cart.CartProductStep;
import StepObject.Search.SearchStep;
import Ultils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.DataCart.DataCart.Quantity;
import static DataObject.DataItem.DataItem.Item;

public class Cart extends ChromeRunner {
    @Test (priority = 0)
    @Description("Case 4 Positive, Check In AddCart")
    @Severity(SeverityLevel.CRITICAL)

    public void CartAddPen (){
        SearchStep Step = new SearchStep();
        CartProductStep Step_1 = new CartProductStep();
        CartPage AddPen = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_1 .Pen();
        Assert.assertTrue(AddPen.AddPenCart.isDisplayed());
    }
    @Test (priority = 1)
    @Description("Case 5 Positive, Check In Product Name")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductName (){
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ProductName = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();;
        Step_2.Pen()
              .GoToCart();
        Assert.assertTrue(ProductName.ProductName.is(Condition.visible));

    }
    @Test (priority = 2)
    @Description("Case 6 Positive, Check In Product Color")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductColor (){
        SearchStep Step = new  SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage CartColor = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart();
        Assert.assertTrue(CartColor.Color.is(Condition.empty));
    }
    @Test (priority = 3)
    @Description("Case 7 Positive, Check In Product Code")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductCode () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ProductCode = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart();
        Assert.assertTrue(ProductCode.Code.is(Condition.visible));
    }
    @Test (priority = 4)
    @Description("Case 8 Positive, Check In Product Quantity")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductQuantity (){
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage Quantity = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart();
        Assert.assertTrue(Quantity.QuantityInput.isDisplayed());
    }
    @Test (priority = 5)
    @Description("Case 9 Positive, Check Product Price")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductPrice () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ProductPrice = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart();
        Assert.assertTrue(ProductPrice.ProductPrice.isDisplayed());
    }
    @Test (priority = 6)
    @Description("Case 10 Positive, Check Product Full Price")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductAllPrice (){
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage FullPrice = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart();
        Assert.assertTrue(FullPrice.ProductFullPrice.is(Condition.visible));
        System.out.println(FullPrice.ProductFullPrice.getText() + " --------------0--");
    }
    @Test (priority = 7)
    @Description("Case 11 Positive, Check In Product Quantity Increase")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductQuantityIncrease () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .QuantityIncrease()
                      .increasedPrice();
        Assert.assertEquals(Step_2.increasedPrice,Step_2.FullPriceValue,"increasedPrice");
    }
    @Test (priority = 8)
    @Description("Case 12 Positive, Check In Product Quantity Reduction")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductQuantityReduction () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        Step.SearchClick()
             .SearchItem(Item)
             .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Quantity(Quantity)
                .ReductionPrice();
        Assert.assertEquals(Step_2.ReductionPrice, Step_2.FullPriceValue,"ReductionPrice");
    }
    @Test (priority = 9)
    @Description("Case 13 Positive, Cart Product Delete")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductDelete () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ItemDelete = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .ItemDelete();
        Assert.assertTrue(ItemDelete.ProductDisappears.is(Condition.disappear));
    }
    @Test (priority = 10)
    @Description("Case 14 Positive, Cart Item Delete")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductDeleteItem () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage CartItem = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .ProductDelete();
        Assert.assertTrue(CartItem.CartItem.is(Condition.disappear));
    }
    @Test (priority = 11)
    @Description("Case 15 Positive, Cart Item Clear Comment (კალათა ცარიელია)")
    @Severity(SeverityLevel.CRITICAL)
    public void CartProductItemClear () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ProductItem = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .ProductClear();
        Assert.assertTrue(ProductItem.EmptyCart.is(Condition.visible));
    }
    @Test (priority = 12)
    @Description("Case 16 Positive, Cart Item Clear Comment (კალათა ცარიელია)")
    @Severity(SeverityLevel.CRITICAL)
    public void CartItemsClear () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ItemsClear = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .ProductClear();
        Assert.assertTrue(ItemsClear.Continue.is(Condition.disappear));
    }
    @Test (priority = 13)
    @Description("Case 17 Positive, Cart Item Clear disappear Comment (კალათის გასუფთავება)")
    @Severity(SeverityLevel.CRITICAL)
    public void CartRemoveCarts () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        CartPage ItemsClear = new CartPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .ProductClear();
        Assert.assertTrue(ItemsClear.RemoveCarts.is(Condition.disappear));
    }
}
