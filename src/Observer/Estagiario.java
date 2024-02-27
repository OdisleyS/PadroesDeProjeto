public class Estagiario implements Observer{

    private String nome;

    public Estagiario(String nome, Subject subject) {

        this.nome =  nome;
        subject.addObserver(this);
    }
    @Override

    public void update(String texto) {
        System.out.println(this.nome + " uma nova vaga pra você! Vaga de " + texto);
    }
}
