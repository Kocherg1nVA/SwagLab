package Test;

import Data.DataHelper;
import Pages.ProductPage;
import Pages.UserLoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class StandardUserSwagLabTest {

    private static UserLoginPage userLogin;
    private static ProductPage productPage;
    private static final SelenideElement cartBadge = $("[data-test='shopping-cart-badge']");


    @BeforeEach
    public void setUp() {
        Configuration.browser = "firefox";
        userLogin = Selenide.open("https://www.saucedemo.com", UserLoginPage.class);
    }

//    @AfterEach
//    public void logOut() {
//        productPage.logOut();
//    }

    @Test
    @DisplayName("Логин стандарт юзер")
    public void shouldSuccessLogin() {
        var authInfo = DataHelper.getStandardUser();
        productPage = userLogin.userLogin(authInfo);
    }

    @Test
    @DisplayName("Добавить рюкзак и футболку в корину")
    public void shouldAddToCartBackpackAndTShirt(){
        var authInfo = DataHelper.getStandardUser();
        productPage = userLogin.userLogin(authInfo);
        productPage.addToCartBackpack();
        productPage.addToCartTShirt();
        cartBadge.shouldBe(Condition.visible).shouldHave(Condition.text("2"));
        productPage.delFromCartBackpack();
        productPage.delFromCartTShirt();
        cartBadge.shouldBe(Condition.hidden);
    }
    @Test
    @DisplayName("Добавить 4 товара в корзину и удалить последний")
    public void shouldAdd4ProductsThenDeleteLast(){
        var authInfo = DataHelper.getStandardUser();
        productPage = userLogin.userLogin(authInfo);
        productPage.addToCartBikeLight();
        productPage.addToCartJacket();
        productPage.addToCartOnesie();
        productPage.addToCartRedTShirt();
        cartBadge.shouldBe(Condition.visible).shouldHave(Condition.text("4"));
        productPage.delFromCartRedTShirt();
        cartBadge.shouldBe(Condition.visible).shouldHave(Condition.text("3"));
    }
}
