package Java;

public class contaPoupanca extends Conta {


    public contaPoupanca(Cliente cliente){
        super(cliente);

    }
    @Override
    public void transferir(double valor, Conta ContaDestino) {

    }

    public void imprimirExtrato(){

     System.out.println("Extrato Poupanca ====");
        ImprimirInfosComuns();

    }


}
