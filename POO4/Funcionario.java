public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    final static double SALARIO_MINIMO = 1621.00;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract String getFuncao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            return;
        }

        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSalario(Double salario) {
       updateSalario(salario.doubleValue());
    }

    private void updateSalario(double salario) {
        if (salario >= 1621) {
            this.salario = salario;
        }
    }

}