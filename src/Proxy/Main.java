package Proxy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pessoa não autorizada acessando");
        GerenciamentoDeArquivos gerenciamento = new Proxy("Odisley", "1234");
        System.out.println(gerenciamento.getArquivos());
        System.out.println(gerenciamento.getLer());
        System.out.println(gerenciamento.getAtualizar());
        System.out.println(gerenciamento.getExcluir());

        System.out.println("\nAdiministrador acessando");
        gerenciamento = new Proxy("admin", "admin");
        System.out.println(gerenciamento.getArquivos());
        System.out.println(gerenciamento.getLer());
        System.out.println(gerenciamento.getAtualizar());
        System.out.println(gerenciamento.getExcluir());

    }
}

