package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa() {};

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, int peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);

        if (imc > 25) {
            return 1;
        } else if (imc < 20) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean ehMaiorIdade() {
        return this.idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "\n" +
                "nome='" + nome + '\'' + ", \n" +
                "idade=" + idade + ", \n" +
                "ID='" + ID + '\''  + ", \n" +
                "peso=" + peso  + ", \n" +
                "altura=" + altura  + "\n" +
                '}';
    }
}
