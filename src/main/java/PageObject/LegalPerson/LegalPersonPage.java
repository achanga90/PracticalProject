package PageObject.LegalPerson;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LegalPersonPage {
    public SelenideElement
           Person = $(byText("იურიდიული პირი")),
           physical = $(byText("ფიზიკური პირი")),
           Send = $(byId("btn2")),
           LegalNameInput = $(byAttribute("placeholder","კომპანიის სახელწოდება")),
           IdentificationId = $(byAttribute("placeholder","საიდენტიფიკაციო კოდი")),
           ContactNumber = $(byAttribute("placeholder","საკონტაქტო ნომერი")),
           Address = $(byAttribute("placeholder","ფაქტიური მისამართი")),
           OrderDataInput = $(byAttribute("placeholder","როდის გსურთ შეკვეთის მიღება?")),
           EmailInput = $(byName("email"));







}
