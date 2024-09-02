

Interface IABCBank {
    void openAccount();
    void closeAccount();

}

interface IBankAccount {
    void deposit();
    void withdraw();
    void balance();

}

class Saving implements IBankAccount {

    @Override
    public void deposit() {
        System.out.println("Deposit in Saving Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw in Saving Account");


    }

    @Override
    public void balance() {
        System.out.println("Balance in Saving Account");


    }
}



public class Interfaces {
    public static void main(String[] args) {
        Saving saving = new Saving();
        saving.deposit();
        saving.withdraw();
        saving.balance();


    }
}
