package src;

public class Pessoa {
    String nome;
    int idade;
    String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + ", cidade='" + cidade + "'}";
    }
}
