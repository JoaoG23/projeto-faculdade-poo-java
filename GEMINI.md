A Programação Orientada a Objetos (POO) é um dos paradigmas mais utilizados no desenvolvimento de software, permitindo a criação de sistemas modulares, reutilizáveis e de fácil manutenção. Em Java, a Programação Orientada a Objetos é baseada em classes, objetos, encapsulamento, herança e polimorfismo, conceitos essenciais para a modelagem de soluções eficientes e escaláveis.
Neste conjunto de atividades, os estudantes praticarão e consolidarão esses fundamentos, avançando progressivamente desde a criação de classes e objetos até a implementação de herança, polimorfismo e interfaces. O objetivo é não apenas compreender a teoria, mas também aplicar os conceitos em situações reais, desenvolvendo habilidades que são fundamentais para o mercado de trabalho.

Referência: OLIVEIRA JUNIOR, E. A.; PEREIRA, R. de L. Programação Avançada. Maringá: UniCesumar, 2016.

Classes e Objetos
1 Criando a primeira classe
Crie uma classe chamada Pessoa com os seguintes atributos:
nome (String)
idade (int)
cidade (String)
No método main, instancie um objeto da classe Pessoa e exiba os dados no console.
 
Métodos e Construtores
2 Classe "Retângulo" com métodos
Crie uma classe Retângulo com os atributos largura e altura e um método:
calcularArea() → Retorna a área do retângulo.
No main, instancie um Retângulo, defina os valores e exiba a área.
 
3 Conta Bancária (Construtor e Métodos)
Crie a classe ContaBancaria com os atributos:
titular
saldo
Implemente os métodos:
depositar(double valor)
sacar(double valor)
exibirSaldo()
No main, crie um objeto e teste as operações de saque e depósito.
Encapsulamento (Getters e Setters)
4 Classe "Produto" (Encapsulamento)
Crie uma classe Produto com os atributos privados:
nome (String)
preco (double)
Implemente os métodos getters e setters para acessar e modificar os atributos.
No main, instancie um objeto Produto, defina os valores e exiba as informações.
 
Herança e Polimorfismo
5 Criando a classe "Funcionário"
Crie uma classe Funcionário com os atributos:
nome
salario
Crie o método calcularBonus(), que retorna 10% do salário.
Agora, crie a classe Gerente, que herda de Funcionário, e sobrescreva calcularBonus() para retornar 20% do salário.
Teste o polimorfismo no main:
Crie um Funcionário e um Gerente, e exiba o bônus de cada um.

6 Sistema de Veículos (Herança e Polimorfismo)
Crie uma classe base chamada Veículo com um método mover().
Agora, crie duas classes-filhas:
Carro → Sobrescreva mover() para exibir "O carro está se movendo rapidamente".
Bicicleta → Sobrescreva mover() para exibir "A bicicleta está se movendo lentamente".
No main, teste o polimorfismo chamando mover() em objetos Carro e Bicicleta.