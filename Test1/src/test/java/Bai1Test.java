import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Bai1Test {
    @Test
    public void testCount(){
        String s = "You Only Live Once. But if You do it right. once is Enough";
        assertEquals(7, Bai1.demTu(s));
    }
}