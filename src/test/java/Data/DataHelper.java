package Data;

import lombok.Value;

public class DataHelper {

    @Value
    public static class AuthInfo {
        String username;
        String password;
    }

    public static AuthInfo standardUser() {
        return new AuthInfo("standard_user", "secret_sauce");
    }
    public static AuthInfo lockedUser() {
        return new AuthInfo("locked_out_user", "secret_sauce");
    }
    public static AuthInfo problemUser() {
        return new AuthInfo("problem_user", "secret_sauce");
    }
    public static AuthInfo perfomanceUser() {
        return new AuthInfo("performance_glitch_user", "secret_sauce");
    }
    public static AuthInfo errorUser() {
        return new AuthInfo("error_user", "secret_sauce");
    }
    public static AuthInfo visualUser() {
        return new AuthInfo("visual_user", "secret_sauce");
    }

}
