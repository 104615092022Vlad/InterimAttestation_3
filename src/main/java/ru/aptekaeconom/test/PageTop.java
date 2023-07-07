package ru.aptekaeconom.test;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTop {
    SelenideElement wishButton = $(".basket-link.delay.with_price");
    ElementsCollection categories = $$(".dropdown .dropdown-toggle");

    public SelenideElement selectCategory(int n) {
        SelenideElement category = $("");

        switch(n) {
            case 0:
                category = categories.get(0);
                break;
            case 1:
                category = categories.get(1);
                break;
            case 2:
                category = categories.get(2);
                break;
            case 3:
                category = categories.get(3);
                break;
            case 4:
                category = categories.get(4);
                break;
            case 5:
                category = categories.get(6);
                break;
            case 6:
                category = categories.get(7);
                break;
            case 7:
                category = categories.get(8);
                break;
        }
        return category;
    }

    public ElementsCollection selectSubcategoriesList(int n) {
        ElementsCollection subcategories = $$("");

        switch (n) {
            case 0:
                $(".table-menu .dropdown:nth-child(2)").hover();
                subcategories = $$(".table-menu .dropdown:nth-child(2) ul li");
                break;
            case 1:
                $(".table-menu .dropdown:nth-child(3)").hover();
                subcategories = $$(".table-menu .dropdown:nth-child(3) ul li");
                break;
            case 2:
                $(".table-menu .dropdown:nth-child(4)").hover();
                subcategories = $$(".table-menu .dropdown:nth-child(4) ul li");
                break;
            case 3:
                $(".table-menu .dropdown:nth-child(5)").hover();
                subcategories = $$(".table-menu .dropdown:nth-child(5) ul li");
                break;
            case 4:
                $(".table-menu .dropdown:nth-child(6)").hover();
                subcategories = $$(".table-menu .dropdown:nth-child(6) ul li");
                break;
            case 5:
                $(".table-menu .dropdown:nth-child(7)").hover();
                $$(" .dropdown-submenu").get(0).hover();
                subcategories = $$(".table-menu .dropdown:nth-child(7) ul li:nth-child(1) ul li");
                break;
            case 6:
                $(".table-menu .dropdown:nth-child(7)").hover();
                $$(" .dropdown-submenu").get(1).hover();
                subcategories = $$(".table-menu .dropdown:nth-child(7) ul li:nth-child(2) ul li");
                break;
            case 7:
                $(".table-menu .dropdown:nth-child(7)").hover();
                $$(" .dropdown-submenu").get(2).hover();
                subcategories = $$(".table-menu .dropdown:nth-child(7) ul li:nth-child(3) ul li");
                break;
        }
        return subcategories;
    }

    SelenideElement pageTitle = $("#pagetitle");
    ElementsCollection breadCrumbs = $$(".bx-breadcrumb-item--mobile");
}
