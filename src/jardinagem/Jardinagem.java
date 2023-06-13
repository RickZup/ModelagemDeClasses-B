package jardinagem;

public class Jardinagem {

    String nomeJardim;
    double quantidadeMetros;
    int quantidadePlantas;
    double quantidadeMetrosGrama;
    double gramaAdubo = 0.100;
    double valorAdubo;
    double valorMetroGrama;
    double valorCorteGrama;

    public Jardinagem(String nomeJardim, double quantidadeMetros, double quantidadeMetrosGrama, double valorAdubo, double valorMetroGrama, double valorCorteGrama) {
        this.nomeJardim = nomeJardim;
        this.quantidadeMetros = quantidadeMetros;
        this.quantidadeMetrosGrama = quantidadeMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorCorteGrama = valorCorteGrama;
    }

    public double usarAdubo(){
        return quantidadeMetrosGrama * 2 * gramaAdubo;
    }

    public double precoAdubo(){
        return usarAdubo() * valorAdubo;
    }

    public double precoCorteGrama(){
        return valorCorteGrama + (quantidadeMetrosGrama * valorMetroGrama);
    }


}
