package Java;


public class main {
    public static void main(String[] args) {
        Cliente Gustavo = new Cliente();
        Gustavo.setNome("Gustavo");



        IConta cc = new contaCorrente(Gustavo);
        IConta poupanca = new contaPoupanca(Gustavo);

        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
