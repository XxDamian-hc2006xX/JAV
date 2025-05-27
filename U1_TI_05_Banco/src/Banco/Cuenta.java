package Banco;

public class Cuenta {
    private String titular ;
    private double saldo ;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto) {
        if (monto >= 0) {
            saldo += monto;

            System.out.println("Operación Exitosa. Deposito hecho " + monto);
            System.out.println(saldo);
        }
    }
    public boolean retirar(double monto) {
        if (monto >= 0 && saldo >= monto) {
           saldo -= monto;
           System.out.println("Operación exitosa. Saldo  " + saldo );
           System.out.println(saldo);
           return true;
        } else{
            System.out.println("Operación Fallida. Saldo insuficiente " + saldo);

            return false;
        }



    }



}
