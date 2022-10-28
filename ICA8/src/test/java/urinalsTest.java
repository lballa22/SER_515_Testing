import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class urinalsTest {
    freeUrinals f = new freeUrinals();
    @Test
    void main() {
        System.out.println("====== LOKA kALYAN BALLA == TEST ONE EXECUTED =======");
        Assertions.assertEquals(-1, f.checkFreeUrinals("011"));

        System.out.println("====== LOKA KALYAN BALLA == TEST TWO EXECUTED =======");
        Assertions.assertEquals(2, f.checkFreeUrinals("0000"));
    }
}
