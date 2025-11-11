public class Main {
    public static void main(String[] args) {
      CuentaBancaria cuenta1 = new CuentaBancaria("Titular1", 2000.46);

        System.out.println("Titular 1: " + cuenta1.getTitular());
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        cuenta1.depositar(5000);
        cuenta1.retirar(20);
        cuenta1.retirar(20000);
    }
}
