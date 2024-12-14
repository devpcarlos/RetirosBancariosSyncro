public class Main {
    public static void main(String[] args) {
        MovimientoBancario movimientoBancario = new MovimientoBancario();
        movimientoBancario.cuentaSaldo(1000);
        movimientoBancario.setName("Juan");
        movimientoBancario.retiro(450);
        movimientoBancario.setName("Carlos");
        movimientoBancario.retiro(650);
    }
}