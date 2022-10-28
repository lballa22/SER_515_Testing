import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class urinalsTest {
    freeUrinals f = new freeUrinals();
    @Test
    void main() {
        System.out.println("====== Loka Kalyan Balla == TEST EXECUTED =======");
        Assertions.assertEquals(false, f.checkFreeUrinals("Loka Kalyan Balla"));
    }
}