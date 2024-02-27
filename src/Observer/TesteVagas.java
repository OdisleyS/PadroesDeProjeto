public class TesteVagas {
    public static void main(String[] args) {

        VagaEstagio vaga = new VagaEstagio();

        vaga.recebeVagas("Gerete");

        Observer estagiario1 = new Estagiario("Alex", vaga);
        Observer estagiario2 = new Estagiario("Carol", vaga);

        vaga.recebeVagas("Analista");

        Observer estagiario3 = new Estagiario("Vanessa", vaga);

        vaga.recebeVagas("Gerente");
        

    }

}
