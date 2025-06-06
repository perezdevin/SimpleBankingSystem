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
@Test
public void testWithdrawSuccess() {
    Account acc = new Account("Joan", 200);
    acc.withdrawAmount(50);
    assertEquals(150, acc.getBalance());
}

@Test
public void testWithdrawExactBalance() {
    Account acc = new Account("Joan", 100);
    acc.withdrawAmount(100);
    assertEquals(0, acc.getBalance());
}

@Test
public void testWithdrawNegativeAmount() {
    Account acc = new Account("Joan", 100);
    acc.withdrawAmount(-20); // Comprova que no afecta al saldo
    assertEquals(100, acc.getBalance());
}

@Test
public void testWithdrawInsufficientFunds() {
    Account acc = new Account("Joan", 50);
    acc.withdrawAmount(100); 
    assertEquals(50, acc.getBalance());
}
