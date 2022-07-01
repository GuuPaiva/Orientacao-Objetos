package Java;

public class contaCorrente extends Conta {

    public contaCorrente(Cliente cliente){
        super(cliente);

    }


    @Override
    public void transferir(double valor, Conta ContaDestino) {

    }

    public void imprimirExtrato(){

        System.out.println("Extrato conta corrente ====");
        super.ImprimirInfosComuns();
    }
}
