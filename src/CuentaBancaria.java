package PACKAGE_NAME;

public class CuentaBancaria {
   private String titular;
    private double saldo;

    public  CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /*public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/

    public void retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Retirado: " + valor + ". Saldo actual: " + saldo);
        }  else {
            System.out.println("Saldo insuficiente. No puedes retirar: " + valor + ". Saldo actual: " + saldo);
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor + "€. Saldo actual: " + saldo);
    }
}
