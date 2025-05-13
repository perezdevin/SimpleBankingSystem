import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testDepositSuccess() {
        Account acc = new Account("Maria", 100);
        acc.depositAmount(50);
        assertEquals(150, acc.getBalance());
    }

    @Test
    public void testDepositZero() {
        Account acc = new Account("Maria", 100);
        acc.depositAmount(0);
        assertEquals(100, acc.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        Account acc = new Account("Maria", 100);
        acc.depositAmount(-20); 
        assertEquals(100, acc.getBalance());
    }
}