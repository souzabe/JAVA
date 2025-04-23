package Basquete;

public abstract class Jogador {
    protected String nome;
    protected int numeroCamisa;
    protected double altura;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public void aquecer(){
        System.out.println(nome + "está aquecendo.");
    }

    public void mostrarInfo(){
        System.out.println(nome + "- Camisa " + numeroCamisa + " - Altura: " + altura + "m");
    }

    public abstract void executarPapel();
}
