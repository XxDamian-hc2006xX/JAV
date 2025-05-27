import Banco.Cuenta;
public class Main {
    public static void main(String[] args) throws Exception {

        Cuenta cuenta = new Cuenta();
        cuenta.depositar(1000);
        cuenta.retirar(200);
        cuenta.retirar(1000);




    }
}