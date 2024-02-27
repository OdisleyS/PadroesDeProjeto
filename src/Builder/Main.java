package Builder;

public class Main {
    public static void main(String[] args) {
        IPersonagemBuilder personagem = new PersonagemBuilderImpl();
        Director director = new Director();

        director.construirPersonagem(personagem);
        Personagem personagem1 = personagem.getPersonagem();
        System.out.println(personagem1);

        personagem = new PersonagemBuilderImpl();
        director.construirPersonagem(personagem);
        personagem.construirNome("Law");
        personagem.contruirArma("Lanca");
        Personagem personagem2 = personagem.getPersonagem();
        System.out.println(personagem2);
    }
}
