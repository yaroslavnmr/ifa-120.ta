package com.softserveinc.ita.shladkyi;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class GoogleSettingsPage {

    public GoogleHomePage changeGoogleLanguage(String abbreviationLanguage) {
        $x("//li[@id='langSecLink']").click();
        $x("//a[@id='langanchormore']").click();
        $x(String.format("//div[@data-value='%s']", abbreviationLanguage)).click();
        $x("//div[@class='goog-inline-block jfk-button jfk-button-action']").click();
        switchTo().alert().accept();
        return new GoogleHomePage();
    }
}