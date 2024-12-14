public class MovimientoBancario {


    private int balance;
    private String name;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cuentaSaldo(final int monto) {
        this.balance = monto;
    }

    public synchronized void retiro(final int amount){
        if (balance>=amount){
            System.out.println("Retiro exitoso de: " + amount);
            balance = balance - amount;
            System.out.println("Saldo restante es de: " + balance);
        }else {
            System.out.println("Saldo insuficiente");
        }

    }
}
