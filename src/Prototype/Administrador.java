package Prototype;

public class Administrador extends Usuario {
    String cargo;

    public Administrador(String nome, byte idade, String email, String cargo) {
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
        return new Administrador(this.nome, this.idade, this.email, this.cargo);
    }
}