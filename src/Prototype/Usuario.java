package Prototype;

public abstract class Usuario {
    String email;
    String nome;
    byte idade;

    public Usuario(String nome, byte idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public abstract Usuario clonar();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
