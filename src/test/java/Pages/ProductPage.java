package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private static final SelenideElement title = $("[data-test='title']");

    private static final SelenideElement backpackAddBut = $("button[data-test='add-to-cart-sauce-labs-backpack']");
    private static final SelenideElement bikeLightAddBut = $("button[data-test='add-to-cart-sauce-labs-bike-light']");
    private static final SelenideElement tShirtAddBut = $("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']");
    private static final SelenideElement jacketAddBut = $("button[data-test='add-to-cart-sauce-labs-fleece-jacket']");
    private static final SelenideElement onesieAddBut = $("button[data-test='add-to-cart-sauce-labs-onesie']");
    private static final SelenideElement tShirtRedAddBut = $("button[data-test='add-to-cart-test.allthethings()-t-shirt-(red)']");

    private static final SelenideElement backpackDelBut = $("button[data-test='remove-sauce-labs-backpack']");
    private static final SelenideElement bikeLightDelBut = $("button[data-test='remove-sauce-labs-bike-light']");
    private static final SelenideElement tShirtDelBut = $("button[data-test='remove-sauce-labs-bolt-t-shirt']");
    private static final SelenideElement jacketDelBut = $("button[data-test='remove-sauce-labs-fleece-jacket']");
    private static final SelenideElement onesieDelBut = $("button[data-test='remove-sauce-labs-onesie']");
    private static final SelenideElement tShirtRedDelBut = $("button[data-test='remove-test.allthethings()-t-shirt-(red)']");


    public ProductPage() {
        title.shouldBe(Condition.visible);
    }
// add to cart
    public void addToCartBackpack(){
        backpackAddBut.click();
    }
    public void addToCartBikeLight(){
        bikeLightAddBut.click();
    }
    public void addToCartTShirt(){
        tShirtAddBut.click();
    }
    public void addToCartJacket(){
        jacketAddBut.click();
    }
    public void addToCartOnesie(){
        onesieAddBut.click();
    }
    public void addToCartRedTShirt(){
        tShirtRedAddBut.click();
    }

    //remove from cart
    public void delFromCartBackpack(){
        backpackDelBut.click();
    }
    public void delFromCartBikeLight(){
        bikeLightDelBut.click();
    }
    public void delFromCartTShirt(){
        tShirtDelBut.click();
    }
    public void delFromCartJacket(){
        jacketDelBut.click();
    }
    public void delFromCartOnesie(){
        onesieDelBut.click();
    }
    public void delFromCartRedTShirt(){
        tShirtRedDelBut.click();
    }
}
