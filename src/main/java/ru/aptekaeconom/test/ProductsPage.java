package ru.aptekaeconom.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {

    ElementsCollection sideCategories = $$(".left_block .menu .full");

    SelenideElement grid = $(".block_list");
    ElementsCollection productsGrid = $$(".catalog_item_wrapp");


    public ElementsCollection selectSideSubcategory(int n) {
        ElementsCollection sideSubcategories = $$("");
        switch (n + 1) {
            case 1:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(1) ul li");
                break;
            case 2:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(2) ul li");
                break;
            case 3:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(3) ul li");
                break;
            case 4:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(4) ul li");
                break;
            case 5:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(5) ul li");
                break;
            case 6:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(6) ul li");
                break;
            case 7:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(7) ul li");
                break;
            case 8:
                sideSubcategories = sideCategories.get(n).$$(":nth-child(8) ul li");
                break;
        }
        return sideSubcategories;
    }


}
