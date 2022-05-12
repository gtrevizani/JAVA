package exercicio;
/*
Instanciando e acessando atributos do objeto
Utilizando o IntelliJ, vamos fazer este primeiro exercícios sobre Orientação a Objetos. Fique a vontade para criar outro
projeto ou utilizar um existente.
Um pet shop te chamou para ajudar no controle dos animais que eles cuidam. Eles irão precisar de muitos serviços, o
primeiro é mapear qual o nome, raça, sexo (macho ou fêmea) e idade.

1. Crie uma classe chamada "Cachorro" e adicione os atributos para nome, raça, sexo e idade.
2. Crie uma outra classe chamada "PetShop" para testarmos nossa classe "Cachorro". Adicione o método "main".
3. Agora vamos instanciar um objeto do tipo "Cachorro". Dentro do método "main" utilize a palavra-chave "new" para criar
o objeto.
4. Agora que temos um objeto do tipo "Cachorro", vamos definir os atributos dele.
5. Para mostrar na saída os valores deste objeto, vamos utilizar o código abaixo.
6. Execute o programa e veja o resultado na saída do console. Arrisque um pouco, crie outro objeto do tipo "Cachorro" e
tente perceber que são objetos diferentes criados a partir de uma única classe.
 */
public class Petshop {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Bilu";
        cachorro1.raca = "Rotweiller";
        cachorro1.sexo = 'M';
        cachorro1.idade = 18;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Belinha";
        cachorro2.raca = "Pastor Alemao";
        cachorro2.sexo = 'F';
        cachorro2.idade = 8;

        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Raça: " + cachorro1.raca);
        System.out.println("Sexo: " + cachorro1.sexo);
        System.out.println("Idade: " + cachorro1.idade);
        System.out.println(" ");
        System.out.println("Nome: " + cachorro2.nome);
        System.out.println("Raça: " + cachorro2.raca);
        System.out.println("Sexo: " + cachorro2.sexo);
        System.out.println("Idade: " + cachorro2.idade);
    }
}
