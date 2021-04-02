package com.softserveinc.ita.shladkyi;

import com.softserveinc.ita.common.WebElementUtil;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleSearchImagesResultPage {

    public List<String> getSearchResultImagesTextList() {
        return WebElementUtil.getElementsListAtLeast("//img[@class='rg_i Q4LuWd']", 10)
                .stream()
                .map(webElement -> webElement.getAttribute("alt"))
                .collect(Collectors.toList());
    }

    public GoogleHomePage openGoogleHomePage() {
        WebElementUtil.clickElement("//a[@class='F1hUFe jbTlie']");
        return new GoogleHomePage();
    }
}
