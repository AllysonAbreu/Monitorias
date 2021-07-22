

public class Conta {

    String cliente;
    double saldo;
    int numeroConta;
    int agencia;

    public Conta() {

    }

    public void verSaldo(double saldo){
        if(saldo > 0){
            System.out.println("O saldo é positivo");
        }
    }

}
