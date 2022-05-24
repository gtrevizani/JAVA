package cad02_orientacao_a_objetos_parte2.pratica.interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail{
    private int numero;

    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    public void adicionarPedido(String produto){
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o e-mail: " + email);
    }

    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de número: " + numero);
    }
}
