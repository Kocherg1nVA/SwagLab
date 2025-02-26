package Pages;

import Data.DataHelper;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final SelenideElement userNameField = $("input[data-test='username']");
    private static final SelenideElement passwordField = $("input[data-test='password']");
    private static final SelenideElement loginButton = $("input[data-test='login-button']");

    public ProductPage validLogin (DataHelper.AuthInfo authInfo) {
        userNameField.setValue(authInfo.getUsername());
        passwordField.setValue(authInfo.getPassword());
        loginButton.click();
        return new ProductPage();
    }
}
