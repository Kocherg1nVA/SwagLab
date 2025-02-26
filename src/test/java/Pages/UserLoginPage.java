package Pages;

import Data.DataHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UserLoginPage {

    private static final SelenideElement userNameField = $("input[data-test='username']");
    private static final SelenideElement passwordField = $("input[data-test='password']");
    private static final SelenideElement loginButton = $("input[data-test='login-button']");

    private static final SelenideElement lockedUserErr = $("h3[data-test='error']");

    public ProductPage userLogin(DataHelper.AuthInfo authInfo) {
        userNameField.setValue(authInfo.getUsername());
        passwordField.setValue(authInfo.getPassword());
        loginButton.click();
        return new ProductPage();
    }

    public void lockedUserLogin(DataHelper.AuthInfo authInfo) {
        userNameField.setValue(authInfo.getUsername());
        passwordField.setValue(authInfo.getPassword());
        loginButton.click();
        lockedUserErr.shouldBe(Condition.visible);
    }
}
