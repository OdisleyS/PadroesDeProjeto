package Prototype;

public class Main {
    public static void main(String[] args) {

        Administrador administrador = new Administrador("Odisley", (byte) 19, "ASD@", "Gerente");
        Administrador admClone = (Administrador) administrador.clonar();

        Cliente cliente = new Cliente("Everson", (byte) 19, "ZXC@", "01010110");
        Cliente cliClone = (Cliente) cliente.clonar();

        Funcionario funcionario = new Funcionario("Gabriel", (byte) 20, "QWE@", "Programador");
        Funcionario funClone = (Funcionario) funcionario.clonar();

        System.out.println(admClone.getNome() + " - " + admClone.getIdade() + " - " + admClone.getEmail() + " - " + admClone.getCargo());
        System.out.println(cliClone.getNome() + " - " + cliClone.getIdade() + " - " + cliClone.getEmail() + " - " + cliClone.getCPF());
        System.out.println(funClone.getNome() + " - " + funClone.getIdade() + " - " + funClone.getEmail() + " - " + funClone.getCargo());
    }
}


