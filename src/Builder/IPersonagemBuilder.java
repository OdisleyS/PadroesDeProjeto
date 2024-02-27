package Builder;

public interface IPersonagemBuilder {

    void construirNome(String nome);
    void construirClasse(String classe);
    void construirNivel(int nivel);
    void contruirArma(String arma);

    Personagem getPersonagem();

}
