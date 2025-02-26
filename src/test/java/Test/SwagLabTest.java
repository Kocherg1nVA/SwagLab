package Test;

import Data.DataHelper;
import Pages.LoginPage;
import Pages.ProductPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class SwagLabTest {

    private static LoginPage loginPage;
    private static ProductPage productPage;
    private static final SelenideElement cartBadge = $("[data-test='shopping-cart-badge']");


    @BeforeEach
    public void setUp() {
        Configuration.browser = "firefox";
        loginPage = Selenide.open("https://www.saucedemo.com", LoginPage.class);
    }

    @Test
    public void shouldSuccessLogin() {
        var authInfo = DataHelper.getStandardUser();
        productPage = loginPage.validLogin(authInfo);
    }

    @Test
    @DisplayName("Добавить рюкзак и футболку в корину")
    public void shouldAddToCartBackpackAndTShirt(){
        var authInfo = DataHelper.getStandardUser();
        productPage = loginPage.validLogin(authInfo);
        productPage.addToCartBackpack();
        productPage.addToCartTShirt();
        cartBadge.shouldBe(Condition.visible).shouldHave(Condition.text("2"));
    }
    @Test
    @DisplayName("Добавить 4 товара в корзину и удалить последний")
    public void shouldAdd4ProductsThenDeleteLast(){
        var authInfo = DataHelper.getStandardUser();
        productPage = loginPage.validLogin(authInfo);
        productPage.addToCartBikeLight();
        productPage.addToCartJacket();
        productPage.addToCartOnesie();
        productPage.addToCartRedTShirt();
        cartBadge.shouldBe(Condition.visible).shouldHave(Condition.text("4"));
        productPage.delFromCartRedTShirt();
        cartBadge.shouldBe(Condition.visible).shouldHave(Condition.text("3"));
    }
}
