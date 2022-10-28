import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class urinalsTest {
    freeUrinals f = new freeUrinals();
    @Test
    void testCheckFreeUrinals1() {
        System.out.println("====== LOKA kALYAN BALLA == TEST ONE EXECUTED =======");
        Assertions.assertEquals(-1, f.checkFreeUrinals("011"));
    }

    @Test
    void testCheckFreeUrinals2() {
        System.out.println("====== LOKA KALYAN BALLA == TEST TWO EXECUTED =======");
        Assertions.assertEquals(2, f.checkFreeUrinals("0000"));
    }
    @Test
    void testCheckFreeUrinals3() {
        System.out.println("====== LOKA KALYAN BALLA == TEST THREE EXECUTED =======");
        Assertions.assertEquals(0, f.checkFreeUrinals("1001"));
    }
    @Test
    void testCheckFreeUrinals4() {
        System.out.println("====== LOKA KALYAN BALLA == TEST FOUR EXECUTED =======");
        Assertions.assertEquals(1, f.checkFreeUrinals("10001"));
    }
    @Test
    void testValidateString1() {
        System.out.println("====== LOKA KALYAN BALLA == TEST ONE EXECUTED =======");
        Assertions.assertEquals(false, f.validateString("00AA7"));
    }
    @Test
    void testValidateString2() {
        System.out.println("====== LOKA KALYAN BALLA == TEST TWO EXECUTED =======");
        Assertions.assertEquals(true, f.validateString("00110"));
    }
}
