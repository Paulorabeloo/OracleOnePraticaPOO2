package tres.atividade;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setPreco(5000);
        System.out.println(p1.aplicarDesconto(10));
    }
}
