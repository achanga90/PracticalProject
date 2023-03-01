package StepObject.Cart;

import PageObject.Cart.CartPage;
import PageObject.LegalPerson.LegalPersonPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import java.time.Duration;

public class CartProductStep extends CartPage {
    public float increasedPrice;
    public float FullPriceValue;
    public float ReductionPrice;
    public float FullPriceValue_1;
    @Step("Search Pen კალამი ბურთულიანი")
    public CartProductStep Pen (){
        Pen.click();
        AddPenCart.shouldBe(Condition.visible, Duration.ofMillis(1000));
        return this;
    }
    @Step("Cart click")
    public CartProductStep GoToCart () {
        Cart.click();
        ProductName.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    @Step("Quantity Increase Click")
    public CartProductStep QuantityIncrease (){
        QuantityIncrease.click();
        QuantityIncrease.shouldBe(Condition.visible, Duration.ofMillis(4000));
        return this;
    }

    @Step("Quantity value in crease")
    public CartProductStep Quantity (String Quantity){
        QuantityInput.setValue(Quantity);
        QuantityInput.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("In Creased Price")
    public CartProductStep increasedPrice (){
        increasedPrice = Float.parseFloat(ProductPrice.getText())*2;
        FullPriceValue = Float.parseFloat(ProductFullPrice.getText());
        return this;
    }
    @Step("Product Price Reduction")
    public CartProductStep ReductionPrice (){
        ReductionPrice = Float.parseFloat(ProductPrice.getText());
        FullPriceValue = Float.parseFloat(ProductFullPrice.getText())/2;
        return this;
    }
    @Step("Cart Item Delete")
    public CartProductStep ItemDelete (){
        ItemDelete.click();
        return this;
    }
    @Step("Cart Item Delete")
    public CartProductStep ProductDelete (){
        DeleteItem.click();
        return this;
    }
    @Step("Cart Item Clear")
    public CartProductStep ProductClear (){
        RemoveCarts.click();
        return this;
    }
    @Step("Cart Go TO Continue")
    public CartProductStep Continue (){
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Continue.click();
        LegalPerson.Person.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }

}
