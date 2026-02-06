import java.util.ArrayList;

public class Sistema {

    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionar(String nome) {
        produtos.add(new Produto(nome));
    }

    void listar() {
        int i = 1;
        for (Produto p : produtos) {
            p.exibir(i++);
        }
    }
}
