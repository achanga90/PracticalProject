package LegalPerson;

import PageObject.LegalPerson.LegalPersonPage;
import StepObject.Cart.CartProductStep;
import StepObject.LegalPerson.LegalPersonStep;
import StepObject.Search.SearchStep;
import Ultils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.DataItem.DataItem.Item;
import static DataObject.LegalPerson.DataLegalPerson.*;

public class LegalPerson extends ChromeRunner {
    @Test (priority = 0)
    @Description("Case 18 Positive, Cart Continue")
    @Severity(SeverityLevel.CRITICAL)
    public void CartGoToContinue () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonPage LegalPerson =new LegalPersonPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Continue();
        Assert.assertTrue(LegalPerson.Person.isDisplayed());
        Assert.assertTrue(LegalPerson.physical.isDisplayed());
    }
    @Test (priority = 1)
    @Description("Case 19 Negative, Check Legal Name value is red")
    @Severity(SeverityLevel.CRITICAL)
    public void LegalNameValidationCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Continue();
        Step_3.Send()
              .ColorIndexLegalName();
        Assert.assertEquals(Color.fromString(LegalPerson.LegalNameInput.getCssValue("border").substring(10,Step_3.IndexLegalName)).asHex(),ColorBorder,"Message LegaLName Color");
    }
    @Test (priority = 2)
    @Description("Case 20 Negative, Check Identification Id value is red")
    @Severity(SeverityLevel.CRITICAL)
    public void IdentificationIDValidationCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
            .GoToCart()
            .Continue();
        Step_3.Send()
              .IdentificationIdColor(LegalName)
              .ColorIndexIdentificationId();
        Assert.assertEquals(Color.fromString(LegalPerson.IdentificationId.getCssValue("border").substring(10,Step_3.IndexIdentificationID)).asHex(),ColorBorder,"Message IdentificationID Color");
    }
    @Test (priority = 3)
    @Description("Case 21 Negative, Check Address value is red")
    @Severity(SeverityLevel.CRITICAL)
    public void AddressValidationCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Continue();
        Step_3.Send()
              .AddressColor()
              .ColorIndexAddress();
        Assert.assertEquals(Color.fromString(LegalPerson.Address.getCssValue("border").substring(10,Step_3.IndexAddress)).asHex(),ColorBorder,"Message IdentificationID Color");
    }
    @Test (priority = 4)
    @Description("Case 22 Negative, ContactNumber value is red")
    @Severity(SeverityLevel.CRITICAL)
    public void ContactNumberValidationCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Continue();
        Step_3.Send()
              .ContactNumberColor()
              .ColorIndexContactNumber();
        Assert.assertEquals(Color.fromString(LegalPerson.ContactNumber.getCssValue("border").substring(10,Step_3.IndexContactNumber)).asHex(),ColorBorder,"Message ContactNumber Color");
    }
    @Test (priority = 5)
    @Description("Case 23 Negative, Check OrderData value is red")
    @Severity(SeverityLevel.CRITICAL)
    public void OrderDataValidationCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
             .SearchItem(Item)
             .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Continue();
        Step_3.Send()
              .OrderDataColor()
              .ColorIndexOrderData();
        Assert.assertEquals(Color.fromString(LegalPerson.OrderDataInput.getCssValue("border").substring(10,Step_3.IndexOrderData)).asHex(),ColorBorder,"Message OrderData Color");
    }
    @Test (priority = 6)
    @Description("Case 24 Negative, Check Email value is red")
    @Severity(SeverityLevel.CRITICAL)
    public void EmailValidationCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
              .Continue();
        Step_3.Send()
              .legalEntityEmailColor()
              .ColorIndexEmail();
        Assert.assertEquals(Color.fromString(LegalPerson.EmailInput.getCssValue("border").substring(10,Step_3.IndexEmail)).asHex(),ColorBorder);
    }
    @Test (priority = 7)
    @Description("Case 25 Positive, Checking Legal Name is not red")
    @Severity(SeverityLevel.CRITICAL)
    public void LegalNameCheck () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
            .SearchItem(Item)
            .SearchItemPressEnter();
        Step_2.Pen()
              .GoToCart()
                .Continue();
        Step_3.Send()
              .LegalName()
              .Send()
              .ColorIndexLegalName();
        Assert.assertNotEquals(Color.fromString(LegalPerson.LegalNameInput.getCssValue("border").substring(10,Step_3.IndexLegalName)).asHex(),ColorBorder);
    }
    @Test (priority = 8)
    @Description("Case 26 Negative, Checking Identification ID String value")
    @Severity(SeverityLevel.CRITICAL)
    public void IdentificationIDString () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationIDString(Id);
        Assert.assertTrue(LegalPerson.IdentificationId.has(Condition.empty));
    }
    @Test (priority = 9)
    @Description("Case 27 Negative, Checking Identification ID Shot value")
    @Severity(SeverityLevel.CRITICAL)
    public void IdentificationIDShort () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationIDShort()
                .Send()
                .ColorIndexIdentificationId();
        Assert.assertEquals(Color.fromString(LegalPerson.IdentificationId.getCssValue("border").substring(10,Step_3.IndexIdentificationID)).asHex(),ColorBorder,"Message IdentificationIDShort Color");
    }
    @Test (priority = 10)
    @Description("Case 28 Negative, Checking Identification ID Long value")
    @Severity(SeverityLevel.CRITICAL)
    public void IdentificationIDLong () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();

        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .IdentificationIDLong();
        Assert.assertEquals(Step_3.IdentificationIDLong().length(),IdentificationID.length());
    }
    @Test (priority = 12)
    @Description("Case 29 Positive, Checking Identification ID is not red")
    @Severity(SeverityLevel.CRITICAL)
    public void IdentificationID() {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .Send()
                .ColorIndexIdentificationId();
        Assert.assertNotEquals(Color.fromString(LegalPerson.IdentificationId.getCssValue("border").substring(10,Step_3.IndexIdentificationID)).asHex(),ColorBorder,"Message IdentificationID Color");
    }
    @Test (priority = 13)
    @Description("Case 30 Positive, Checking Address Value")
    @Severity(SeverityLevel.CRITICAL)
    public void Address() {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .Send()
                .address()
                .Send()
                .ColorIndexAddress();
        Assert.assertNotEquals(Color.fromString(LegalPerson.IdentificationId.getCssValue("border").substring(10,25)).asHex(),ColorBorder,"Message IdentificationID Color");
    }
    @Test (priority = 14)
    @Description("Case 31 Negative, Checking Contact Number String Value")
    @Severity(SeverityLevel.CRITICAL)
    public void ContactNumberSting () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .ContactNumberString();
        Assert.assertTrue(LegalPerson.ContactNumber.has(Condition.empty));
    }
    @Test (priority = 15)
    @Description("Case 32 Negative, Checking Contact Number Short Value")
    @Severity(SeverityLevel.CRITICAL)
    public void ContactNumberShort () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .ContactNumberShort()
                .Send()
                .ColorIndexContactNumber();
        Assert.assertEquals(Color.fromString(LegalPerson.ContactNumber.getCssValue("border").substring(10,Step_3.IndexContactNumber)).asHex(),ColorBorder,"Message ContactNumberShort Color");
    }
    @Test (priority = 16)
    @Description("Case 33 Negative, Checking Contact Number Long Value")
    @Severity(SeverityLevel.CRITICAL)
    public void ContactNumberLong () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .ContactNumberLong();
        Assert.assertNotEquals(Step_3.ContactNumberLong(),PhoneNumber);
    }
    @Test (priority = 17)
    @Description("Case 34 Positive, Checking Contact Number Short Value")
    @Severity(SeverityLevel.CRITICAL)
    public void ContactNumber () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .ContactNumberShort()
                .Send()
                .ColorIndexContactNumber();
        Assert.assertNotEquals(Color.fromString(LegalPerson.ContactNumber.getCssValue("border").substring(10,Step_3.IndexContactNumber)).asHex(),ColorBorder);
    }
    @Test (priority = 18)
    @Description("Case 35 Negative, Checking orderData Less Symbol")
    @Severity(SeverityLevel.CRITICAL)
    public void orderDataLess () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .address()
                .ContactNumber()
                .orderDataLess()
                .Send()
                .ColorIndexOrderData();
        System.out.println(Step_3.IndexOrderData);
        Assert.assertEquals(Color.fromString(LegalPerson.OrderDataInput.getCssValue("border").substring(10,Step_3.IndexOrderData)).asHex(),ColorBorder,"Message OrderData Color");
    }
    @Test (priority = 19)
    @Description("Case 36 Positive, Checking orderData More Symbol")
    @Severity(SeverityLevel.CRITICAL)
    public void orderDataMore () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .address()
                .ContactNumber()
                .orderDataMore()
                .Send()
                .ColorIndexOrderData();
        Assert.assertNotEquals(Color.fromString(LegalPerson.OrderDataInput.getCssValue("border").substring(10,Step_3.IndexOrderData)).asHex(),ColorBorder);
    }
    @Test (priority = 20)
    @Description("Case 37 Positive, Checking email Value")
    @Severity(SeverityLevel.CRITICAL)
    public void email () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .address()
                .ContactNumber()
                .orderData()
                .Email()
                .Send()
                .ColorIndexEmail();
        Assert.assertNotEquals(Color.fromString(LegalPerson.EmailInput.getCssValue("border").substring(10,Step_3.IndexEmail)).asHex(),ColorBorder);
    }
    @Test (priority = 21)
    @Description("Case 38 Positive, Checking email Value")
    @Severity(SeverityLevel.CRITICAL)
    public void email_1 () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .address()
                .ContactNumber()
                .orderData()
                .Email_1()
                .Send()
                .ColorIndexEmail();
        Assert.assertEquals(Color.fromString(LegalPerson.EmailInput.getCssValue("border").substring(10,Step_3.IndexEmail)).asHex(),ColorBorder,"Message email");
    }
    @Test (priority = 22)
    @Description("Case 39 Positive, Checking email Value")
    @Severity(SeverityLevel.CRITICAL)
    public void email_2 () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .address()
                .ContactNumber()
                .orderData()
                .Email_2()
                .Send()
                .ColorIndexEmail();
        Assert.assertEquals(Color.fromString(LegalPerson.EmailInput.getCssValue("border").substring(10,Step_3.IndexEmail)).asHex(),ColorBorder,"Message email");
    }
    @Test (priority = 23)
    @Description("Case 40 Positive, Checking email Value")
    @Severity(SeverityLevel.CRITICAL)
    public void email_3 () {
        SearchStep Step = new SearchStep();
        CartProductStep Step_2 = new CartProductStep();
        LegalPersonStep Step_3 = new LegalPersonStep();
        LegalPersonPage LegalPerson = new LegalPersonPage();
        Step.SearchClick()
                .SearchItem(Item)
                .SearchItemPressEnter();
        Step_2.Pen()
                .GoToCart()
                .Continue();
        Step_3.IdentificationIdColor(LegalName)
                .IdentificationID()
                .address()
                .ContactNumber()
                .orderData()
                .Email_3()
                .Send()
                .ColorIndexEmail();
        Assert.assertEquals(Color.fromString(LegalPerson.EmailInput.getCssValue("border").substring(10,Step_3.IndexEmail)).asHex(),ColorBorder,"Message email");
    }
}
