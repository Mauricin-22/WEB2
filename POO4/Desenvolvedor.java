public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String getFuncao() {
        return "Desenvolvedor";
    }
}
