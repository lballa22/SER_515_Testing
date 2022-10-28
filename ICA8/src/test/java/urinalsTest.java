import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class urinalsTest {
    freeUrinals f = new freeUrinals();
    @Test
    void main() {
        System.out.println("====== Loka Kalyan Balla == TEST ONE EXECUTED =======");
        Assertions.assertEquals(-1, f.checkFreeUrinals("011"));
    }
}
