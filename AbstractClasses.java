
abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();

}

class SavingAccount extends BankAccount{

    @Override
    void deposit() {
        System.out.println("Deposit in Saving Account.");

    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Saving Account.");

    }

    @Override
    void balance() {
        System.out.println("Balance in saving Account.");

    }
}


class CurrentAccount extends  BankAccount {

    @Override
    void deposit() {
        System.out.println("Deposit in Saving Account.");

    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Saving Account.");

    }

    @Override
    void balance() {
        System.out.println("Balance in saving Account.");

    }

}


public class AbstractClasses {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.balance();




    }
}
