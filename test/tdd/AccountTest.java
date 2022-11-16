package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        //given
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(5000, deborahAccountBalance);

    }

    @Test
    public void depositTwiceTest(){
      //given there is an account
        Account deborahAccount = new Account();

      //given that initial balance is 4000
        deborahAccount.deposit(4000);

      //when i deposit 2000
        deborahAccount.deposit(2000);

      //check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccountBalance);


    }

    @Test
    public void depositNegativeAmountTest() {

        //given there is an account
        Account deborahAccount = new Account();

        //given that initial balance is 4000
        deborahAccount.deposit(4000);

        //when i deposit -2000
        deborahAccount.deposit(-2000);

        //check that balance is 4000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);

    }

    @Test
    public void withdrawalTest() {
        //given
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //when I withdraw 1000
        deborahAccount.withdrawal(1000);

        //check that balance is reduced by 1000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);


    }

    @Test
    public void withdrawalBeyondAmountTest() {

        //given there is an account
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //when I withdraw 7000
        deborahAccount.withdrawal(7000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(5000, deborahAccountBalance);

    }

    @Test
    public void withdrawalDrunkTest() {

        //given there is an account
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //when I withdraw 7000
        deborahAccount.withdrawal(-7000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(5000, deborahAccountBalance);

    }

    @Test
    public void withdrawEqualAmountTest() {

        //given there is an account
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //when I withdraw 5000
        deborahAccount.withdrawal(5000);

        //check that balance is 0
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(0, deborahAccountBalance);

    }
}
