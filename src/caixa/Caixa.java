package caixa;

public class Caixa {

    double saldo;

    public Caixa() {
        this.saldo = 1000;
    }

    public void credito (double valorEntrada){
        saldo += valorEntrada;
    }

    public void debito (double valorSaida){
        saldo -= valorSaida;
    }

}
