package objetos;

public class ContaBancaria {

    private Cliente titular;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public ContaBancaria (){}

    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca (double valor){
        this.saldo -= valor;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
}
