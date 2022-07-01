package Java;

public abstract class Conta implements IConta {

   private static int Agencia_Padrao = 0007;


    private static int SEQUENCIAL = 0;


    int agencia;
    int numero;
    double saldo;
    protected Cliente cliente;

    public Conta() {
        this.agencia = Agencia_Padrao;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    void sacar() {

    }
    public void depositar(){

    }

    public void transfeir(){


    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -=valor;

    }

    @Override
    public void depositar(double valor) {
        saldo +=valor;

    }

    @Override
    public void transferir(double valor, IConta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

    }

    void ImprimirInfosComuns() {
        System.out.println(String.format("Cliente:  %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia:  %d", this.agencia));
        System.out.println(String.format("Numero:  %d", this.numero));
        System.out.println(String.format("Saldo:  %.2f", this.saldo));
    }

    }

