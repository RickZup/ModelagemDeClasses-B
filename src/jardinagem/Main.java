package jardinagem;

public class Main {
    public static void main(String[] args) {
        Jardinagem meuJardim = new Jardinagem("Rick Garden", 20, 10,
                15, 5, 50);

        System.out.println("Quantidade de adubo usado: " + meuJardim.usarAdubo());
        System.out.println("Valor gasto com adubo: " + meuJardim.precoAdubo());
        System.out.println("Preço do corte da grama: " +meuJardim.precoCorteGrama());

    }
}
