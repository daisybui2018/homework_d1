import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

class mainTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @Test
    @DisplayName("Email")
    void emailChecking(){
        String email1 = "abc@gmail.com";
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        assertThat(email1).matches(regex);
    }

    @Test
    @DisplayName("Weight")
    void weightChecking(){
        float w = 53.5f;
        assertThat(w).isBetween(0f, 200f);
    }

    //Viết TC để kiểm tra email có hợp lệ
    //Viết TC kiểm tra cân nặng của người
}