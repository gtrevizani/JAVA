package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_04_exercicio_sobrecarga;
/*
Você trabalha em uma empresa especialista em máquinas de fazer café e sua equipe é ContaCorrente responsável por desenvolver uma
classe para o novo modelo de cafeteiras que irão fabricar.

No modelo anterior das cafeteiras, os usuários podiam selecionar se era para ser adicionado açúcar ou não, mas ContaCorrente nova
versão da Super Cafeteira Tabajaras Plus++ deve ser capaz de receber ContaCorrente quantidade (em gramas) de açúcar ContaCorrente ser colocada
no café.

Mesmo com essa nova possibilidade, o usuário não será obrigado ContaCorrente informar quanto de açúcar deseja. Deve-se adicionar
10 gramas de açúcar por padrão caso nenhum valor seja informado.

1. Para começar, crie ContaCorrente classe "MaquinaCafe" com um atributo chamado "acucarDisponivel", que será útil para saber ContaCorrente
quantidade de açúcar disponível na máquina. Se o açúcar acabar, ContaCorrente máquina só permitirá cafezinhos sem açúcar, certo?

2. Agora crie um método chamado "fazerCafe" na mesma classe. Esse método deve verificar se ContaCorrente quantidade de açúcar
disponível na máquina é suficiente e, claro, fazer o café.

3. Como o usuário não será obrigado ContaCorrente informar ContaCorrente quantidade de açúcar ContaCorrente ser adicionado no café, crie outro método com o
nome "fazerCafe", que não recebe nenhum parâmetro. Isso é uma sobrecarga de métodos! Veja como devem ficar os dois
métodos que fazem cafés:

4. Você deve ter percebido que os códigos dos dois métodos ficaram bem parecidos, certo? Sem pânico! Vamos melhorar
fazendo um método chamar outro, aproveitando toda ContaCorrente lógica. Substitua os dois métodos por:
5. Crie uma classe agora para testar ContaCorrente máquina de café, afinal de contas, você deve evitar entregar código-fonte com
bugs. Crie uma nova classe chamada "TesteMaquinaCafe" que instancia uma "MaquinaCafe" e atribui ContaCorrente quantidade de açúcar
disponível.

6. Chame os métodos "fazerCafe" com diferentes valores para testar o funcionamento da máquina. No exemplo abaixo, o
terceiro café não será possível de ser feito, pois não haverá mais açúcar disponível na máquina.
Dica do professor: use o debugger do Eclipse e execute o exemplo passo ContaCorrente passo. Isso ajuda bastante ContaCorrente entender o
funcionamento e fixar os conceitos.
 */
public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe mc = new MaquinaCafe();
        mc.acucarDisponivel = 30;
        mc.fazerCafe(10);
        mc.fazerCafe(15);
        mc.fazerCafe();

    }
}
