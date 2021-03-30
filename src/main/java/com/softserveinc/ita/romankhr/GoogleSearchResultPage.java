package com.softserveinc.ita.romankhr;

import com.softserveinc.ita.common.TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleSearchResultPage {

    public List<String> getSearchResultLinksTitles() {
        return TestRunner.getDriver().findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<String> getSearchResultsLinks() {
        return TestRunner.getDriver().findElements(By.xpath("//div[@class='yuRUbf']/a"))
                .stream()
                .map(webElement -> webElement.getAttribute("href"))
                .collect(Collectors.toList());
    }

    public GoogleSearchResultImagesPage navigateToImagesPage() {
        TestRunner.getDriver().findElement(By.xpath("//div[@class='MUFPAc']/div[2]")).click();
        return new GoogleSearchResultImagesPage();
    }

    public GoogleSearchResultWebdriverPage navigateToWebdriverResultPage() {
        TestRunner.getDriver().findElement(By.xpath("//a[contains(text(),\"10\")]")).click();
        TestRunner.getDriver().findElement(By.xpath("//a[contains(text(),\"14\")]")).click();
        return new GoogleSearchResultWebdriverPage();
    }


}
