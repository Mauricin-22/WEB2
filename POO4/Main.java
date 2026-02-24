public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(
                "Carlos",
                "123.456.789-00",
                5000.0,
                "1234"
        );

        double sal = Funcionario.SALARIO_MINIMO;

        System.out.println("Salário mínimo: " + sal);
        System.out.println("Função: " + gerente.getFuncao());
    }
}
