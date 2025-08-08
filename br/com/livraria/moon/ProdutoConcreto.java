package br.com.livraria.moon;


public class ProdutoConcreto implements Produto, Promocional {
    private double valor;

    public ProdutoConcreto(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 1) {
            return false; // desconto inválido
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
    @Override
    public String toString() {
        return "ProdutoConcreto{valor=R$ " + valor + "}";
    }

}

