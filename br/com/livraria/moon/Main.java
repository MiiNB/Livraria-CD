import br.com.livraria.moon.*;
import br.com.livraria.moon.teste.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto p1 = new ProdutoConcreto(50.0);
        Produto p2 = new ProdutoConcreto(30.0);
        Produto p3 = new ProdutoConcreto(20.0);


        // Adicionando produtos
        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);

        System.out.println("\nLista de produtos após adição:");
        carrinho.listarProdutos();
        System.out.println("Total: R$ " + carrinho.getTotal());

        // Removendo produto pelo objeto
        carrinho.remover(p2);
        System.out.println("\nLista de produtos após remover p2:");
        carrinho.listarProdutos();
        System.out.println("Total: R$ " + carrinho.getTotal());

        // Removendo produto pelo índice
        carrinho.remover(0);
        System.out.println("\nLista de produtos após remover índice 0:");
        carrinho.listarProdutos();
        System.out.println("Total: R$ " + carrinho.getTotal());

        // Tentando remover índice inválido
        carrinho.remover(5);

        // Tentando remover produto que não existe
        Produto p4 = new ProdutoConcreto(10.0);

        carrinho.remover(p4);
    }
}
