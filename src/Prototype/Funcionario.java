package Prototype;

public class Funcionario extends Usuario {
    String cargo;

    public Funcionario(String nome, byte idade, String email, String cargo) {
        super(nome, idade, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String carga) {
        this.cargo = carga;
    }

    @Override
    public Usuario clonar() {
        return new Funcionario(this.nome, this.idade, this.email, this.cargo);
    }
}