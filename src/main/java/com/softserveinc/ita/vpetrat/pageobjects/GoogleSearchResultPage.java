package com.softserveinc.ita.vpetrat.pageobjects;

import com.softserveinc.ita.vpetrat.testrunner.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleSearchResultPage {

    public List<String> getListOfSearchResultLinksText() {
        return TestRunner
                .getWait()
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[@class='LC20lb DKV0Md']")))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<String> getListOfSearchResultLinks() {
        return TestRunner
                .getWait()
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='yuRUbf']/a")))
                .stream()
                .map(webElement -> webElement.getAttribute("href"))
                .collect(Collectors.toList());
    }

    public String getSearchResultLinkTextForIndex(int index) {
        return getListOfSearchResultLinks().get(index);
    }
}