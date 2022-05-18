package cad01_orientacao_a_objetos.pratica.EX01_ALGORITMO_PASSEIO;

/*
composição de objetos e chamada de métodos
Vamos aproveitar a ideia do último exercício e aprender um pouco mais.

Imagine agora que você precise criar um programa para fazer uma pessoa caminhar com seu cãozinho. Nesta versão, cada
pessoa pode ter apenas um animal, pois ainda não aprendemos outras estruturas de dados que permitem armazenar listas de
objetos.

1. Crie a classe "Pessoa" e adicione um atributo do tipo "Cachorro". Assim estamos dizendo que uma "Pessoa" tem um
"Cachorro" (essa classe é a mesma dos últimos exercícios).

2. Vamos criar uma classe chamada de "Caminhada" com um método "andar" que recebe como parametro um ojbeto do tipo
"Pessoa". Dentro desse método, iremos simplesmente dizer os nomes da pessoa e do cachorro que estariam caminhado.

3. Agora podemos criar o passeio. Para isso crie uma nova classe chamada "Passeio" e adicione o método "main", agora
podemos pensar na lógica de instanciar os objetos e chamar os métodos apropriados.

4. Compile e execute a classe Passeio, você deverá ver no console o nome da pessoa e do cachorro que estão passeando.
 */
public class Passeio {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); // Instanciamento
        p1.nome = "José"; // Objeto e atributo

        p1.cachorro = new Cachorro(); // Instanciamento de dois objetos
        p1.cachorro.nome = "Bidu"; // Objeto, objeto e atributo
        p1.cachorro.raca = "Pinscher";
        p1.cachorro.idade = 3;
        p1.cachorro.sexo = 'M';

        Caminhada c = new Caminhada(); // Instanciamento
        c.andar(p1); // Método do objeto
    }
}
