public class Produto {

    String nome;

    Produto(String nome) {
        this.nome = nome;
    }

    void exibir(int indice) {
        System.out.println(indice + " - " + nome);
    }
}
