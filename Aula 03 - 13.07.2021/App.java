
public class App {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Conta conta1 = new Conta();


        System.out.println(conta);
        conta.cliente = "Allyson Abreu";
        conta.saldo = 1000;
        conta.numeroConta = 658987;
        conta.agencia = 147;
        System.out.println(conta.cliente);
        System.out.println(conta.saldo);
        conta.verSaldo(conta.saldo);



//        System.out.println(conta1);
//        conta1.cliente = "Rocha";
//        conta1.saldo = 5000;
//        conta1.numeroConta = 6589;
//        conta1.agencia = 147;
//        System.out.println(conta1.cliente);
//        System.out.println(conta1.saldo);






    }


}
