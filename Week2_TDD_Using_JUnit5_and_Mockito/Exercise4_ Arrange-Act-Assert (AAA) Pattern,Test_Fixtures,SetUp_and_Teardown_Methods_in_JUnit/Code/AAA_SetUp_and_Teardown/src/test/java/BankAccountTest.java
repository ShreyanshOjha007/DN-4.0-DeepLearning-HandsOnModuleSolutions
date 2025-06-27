import org.example.BankAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp(){
        account = new BankAccount(); // Arrange
        System.out.println("BeforeEach : New back account initialized");
    }

    @Test
    void testDeposit(){

        // Act
        account.deposit(500);

        // Assert
        Assertions.assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw(){

        // Arrange
        account.deposit(1000);

        // Act
        account.withdraw(400);

        // Assert
        Assertions.assertEquals(600, account.getBalance());
    }

    @AfterEach
    void tearDown() {
        account = null; // Clean up
        System.out.println("AfterEach: BankAccount reference cleared.");
    }
}
