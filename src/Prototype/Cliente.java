package Prototype;

public class Cliente extends Usuario {
    String CPF;

    public Cliente(String nome, byte idade, String email, String CPF) {
        super(nome, idade, email);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCargo(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public Usuario clonar() {
        return new Cliente(this.nome, this.idade, this.email, this.CPF);
    }
}
