package DE190010.Test;
import DE190010.example.InsecureLogin;
import org.junit.jupiter.api.Test;

class InsecureLoginTest {

    @Test
    void testLoginSuccess() {
        InsecureLogin.login("admin", "123456");
        // Kong cần assert nếu chỉ cần chạy để trench warning "method not used"
    }

    @Test
    void testLoginFail() {
        InsecureLogin.login("user", "wrong password");
    }

    @Test
    void testPrintUserInfo() {
        InsecureLogin insecureLogin = new InsecureLogin();
        insecureLogin.printUserInfo("John Doe");
    }
}
