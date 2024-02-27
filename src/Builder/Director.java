package Builder;

public class Director {

    void construirPersonagem(IPersonagemBuilder personagem){
        personagem.construirNome("joazin01");
        personagem.construirClasse("Guerreiro");
        personagem.construirNivel(69);
        personagem.contruirArma("Espada");
    }
}
