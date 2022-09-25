package Main;

import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa("Matheus", 27, "PE0002", 98, 1.84);
        System.out.println(novaPessoa);

        switch (novaPessoa.calcularIMC()) {
            case 1:
                System.out.println(novaPessoa.getNome() + " está com sobrepeso.");
                break;
            case 0:
                System.out.println(novaPessoa.getNome() + " é considerada saudável!");
                break;
            case -1:
                System.out.println(novaPessoa.getNome() + " está abaixo do peso.");
                break;
        }

        if (novaPessoa.ehMaiorIdade()) {
            System.out.println(novaPessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(novaPessoa.getNome() + " é menor de idade.");
        }
    }
}
