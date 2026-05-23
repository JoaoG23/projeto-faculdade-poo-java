package src;

public class Main {
    public static void main(String[] args) {
        // 1. Pessoa
        Pessoa p = new Pessoa("João", 25, "Maringá");
        System.out.println(p);

        // 2. Retângulo
        Retangulo r = new Retangulo(10, 5);
        System.out.println("Área do retângulo: " + r.calcularArea());

        // 3. Conta Bancária
        ContaBancaria conta = new ContaBancaria("Maria", 1000);
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();

        // 4. Produto
        Produto prod = new Produto();
        prod.setNome("Notebook");
        prod.setPreco(3500.00);
        System.out.println("Produto: " + prod.getNome() + ", Preço: R$ " + prod.getPreco());

        // 5. Funcionário/Gerente
        Funcionario f = new Funcionario("Carlos", 2000);
        Gerente g = new Gerente("Ana", 5000);
        System.out.println("Bônus funcionário: " + f.calcularBonus());
        System.out.println("Bônus gerente: " + g.calcularBonus());

        // 6. Veículos
        Veiculo carro = new Carro();
        Veiculo bike = new Bicicleta();
        carro.mover();
        bike.mover();
    }
}
