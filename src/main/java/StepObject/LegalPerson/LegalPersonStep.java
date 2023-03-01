package StepObject.LegalPerson;

import DataObject.LegalPerson.DataLegalPerson;
import PageObject.LegalPerson.LegalPersonPage;
import io.qameta.allure.Step;


import static DataObject.LegalPerson.DataLegalPerson.*;
public class LegalPersonStep extends LegalPersonPage {
    public int IndexLegalName;
    public int IndexIdentificationID;
    public int IndexAddress;
    public int IndexContactNumber;
    public int IndexOrderData;
    public int IndexEmail;
    public LegalPersonStep Send (){
        Send.click();
        return this;
    }
    public LegalPersonStep LegalName (){
        LegalNameInput.setValue(DataLegalPerson.LegalName);
        return this;
    }
    @Step("check email color")
    public LegalPersonStep legalEntityEmailColor (){
        LegalNameInput.setValue(DataLegalPerson.LegalName);
        IdentificationId.setValue(String.valueOf(IdentificationIDShort));
        Address.setValue(factualAddress);
        ContactNumber.setValue(String.valueOf(ContactNumber));
        OrderDataInput.setValue(orderData);
        return this;
    }
    @Step("check lIdentificationId color")
    public LegalPersonStep IdentificationIdColor(String Name){
        LegalNameInput.setValue(Name);;
        return this;
    }
    @Step("check AddressColor color")
    public LegalPersonStep AddressColor (){
        LegalNameInput.setValue(DataLegalPerson.LegalName);
        IdentificationId.setValue(String.valueOf(IdentificationIDShort));;
        return this;
    }
    @Step("check ContactNumber color")
    public LegalPersonStep ContactNumberColor (){
        LegalNameInput.setValue(DataLegalPerson.LegalName);
        IdentificationId.setValue(String.valueOf(IdentificationIDShort));
        Address.setValue(factualAddress);
        return this;
    }
    @Step("check OrderData color")
    public LegalPersonStep OrderDataColor (){
        LegalNameInput.setValue(DataLegalPerson.LegalName);
        IdentificationId.setValue(String.valueOf(IdentificationIDShort));
        Address.setValue(factualAddress);
        ContactNumber.setValue(String.valueOf(ContactNumber));
        return this;
    }
    @Step("LegalName color index")
    public LegalPersonStep ColorIndexLegalName (){
        IndexLegalName = LegalNameInput.getCssValue("border").length();
        return this;
    }
    @Step("IdentificationId color index")
    public LegalPersonStep ColorIndexIdentificationId () {
        IndexIdentificationID = IdentificationId.getCssValue("border").length();
        return this;
    }
    @Step("Address color index")
    public LegalPersonStep ColorIndexAddress (){
        IndexAddress = Address.getCssValue("border").length();
        return this;
    }
    @Step("ContactNumber color index")
    public LegalPersonStep ColorIndexContactNumber (){
        IndexContactNumber = ContactNumber.getCssValue("border").length();
        return this;
    }
    @Step("OrderData color index")
    public LegalPersonStep ColorIndexOrderData (){
        IndexOrderData = OrderDataInput.getCssValue("border").length();
        return this;
    }
    @Step("Email color index")
    public LegalPersonStep ColorIndexEmail (){
        IndexEmail = EmailInput.getCssValue("border").length();
        return this;
    }
    @Step("IdentificationId String value")
    public LegalPersonStep IdentificationIDString (String ID) {
        IdentificationId.setValue(Id);
        return this;
    }
    @Step("11 symbol")
    public LegalPersonStep IdentificationIDShort () {
        IdentificationId.setValue(String.valueOf(IdentificationIDShort));
        return this;
    }
    @Step("check IdentificationIDLong")
    public String IdentificationIDLong () {
        return IdentificationId.getAttribute("value");

    }
    @Step("check IdentificationID")
    public LegalPersonStep IdentificationID () {
        IdentificationId.setValue((IdentificationID));
        return this;
    }
    @Step("ContactNumber String Value")
    public LegalPersonStep ContactNumberString () {
        IdentificationId.setValue(ContactNumber_1);
        return this;
    }
    @Step("ContactNumber Short Value")
    public LegalPersonStep ContactNumberShort () {
        ContactNumber.setValue(String.valueOf(ContactNumberShort));
        return this;
    }
    @Step("ContactNumber Long Value")
    public LegalPersonStep ContactNumberLong () {
        ContactNumber.setValue(ContactNumberLong);
        return this;
    }
    @Step("ContactNumber Long Value")
    public LegalPersonStep ContactNumber () {
        ContactNumber.setValue(String.valueOf(PhoneNumber));
        return this;
    }
    @Step("address Value")
    public LegalPersonStep address () {
        Address.setValue(factualAddress);
        return this;
    }
    @Step("orderData Less than 5 characters Symbol")
    public LegalPersonStep orderDataLess () {
        String OrderData = OrderDataInput.getValue();
        for (int i = 0; i < orderData.length(); i++){
            if (i < OrderData.length());
        }
        return this;
    }
    @Step("orderData More than 5 characters Symbol")
    public LegalPersonStep orderDataMore () {
        String OrderData = OrderDataInput.getValue();
        for (int i = 0; i < orderData.length(); i++){
            if (i > OrderData.length());
        }
        return this;
    }
    @Step("orderData Checking value")
    public LegalPersonStep orderData () {
        OrderDataInput.click();
        return this;
    }
    @Step("Email Checking value")
    public LegalPersonStep Email () {
        EmailInput.setValue(email);
        return this;
    }
    @Step("Email Checking value")
    public LegalPersonStep Email_1 () {
        EmailInput.setValue(email_1);
        return this;
    }
    @Step("Email Checking value")
    public LegalPersonStep Email_2 () {
        EmailInput.setValue(email_2);
        return this;
    }
    @Step("Email Checking value")
    public LegalPersonStep Email_3 () {
        EmailInput.setValue(email_3);
        return this;
    }


}