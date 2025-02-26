package Data;

import lombok.Value;

public class DataHelper {

    @Value
    public static class AuthInfo {
        String username;
        String password;
    }

    public static AuthInfo getStandardUser() {
        return new AuthInfo("standard_user", "secret_sauce");
    }
    public static AuthInfo getLockedUser() {
        return new AuthInfo("locked_out_user", "secret_sauce");
    }
    public static AuthInfo getProblemUser() {
        return new AuthInfo("problem_user", "secret_sauce");
    }
    public static AuthInfo getPerfomanceUser() {
        return new AuthInfo("performance_glitch_user", "secret_sauce");
    }
    public static AuthInfo getErrorUser() {
        return new AuthInfo("error_user", "secret_sauce");
    }
    public static AuthInfo getVisualUser() {
        return new AuthInfo("visual_user", "secret_sauce");
    }

}
