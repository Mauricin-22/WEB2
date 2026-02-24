public class Gerente extends Funcionario implements Autenticavel {

    private String senha;

     public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }



     @Override
    public String getFuncao() {
        return "Gerente";
    }

     @Override
     public void Login(String senha) {
        if(this.senha == senha) {
            System.out.println("\nSenha válida.")
        }
     }
}


