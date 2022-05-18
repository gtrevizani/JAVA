package cad07_programacao_orientada_a_objetos.pratica.EX02_ALGORITMO_VENDAS;

public class Pedido { // Objeto
    Integer codigo; // Atributos
    Double subtotal;
    Double desconto;

    Double getTotal() {
        return subtotal - desconto;
    } // Método de chamada

    void setTotal(Double total) {
        // Não é mais necessário
    }

    Integer getCodigo() {
        return codigo;
    } // Método de chamada

    void setCodigo(Integer codigo) {
        this.codigo = codigo;
    } // Método de atribuição

    Double getSubtotal() {
        return subtotal;
    } // Método de chamada

    void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    } // Método de atribuição

    Double getDesconto() {
        return desconto;
    } // Método de chamada

    void setDesconto(Double desconto) {
        this.desconto = desconto;
    } // Método de atribuição
}
