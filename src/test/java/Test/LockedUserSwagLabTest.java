package Test;

import Data.DataHelper;
import Pages.UserLoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LockedUserSwagLabTest {

    private static UserLoginPage userLoginPage;

    @Test
    @DisplayName("Логин заблокированного юзера")
    public void shouldNotLoginLockedUser() {
        userLoginPage = Selenide.open("https://www.saucedemo.com", UserLoginPage.class);
        var authInfo = DataHelper.getLockedUser();
        userLoginPage.lockedUserLogin(authInfo);
    }
}
