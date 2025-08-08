import br.com.livraria.moon.Produto;

public class CarrinhoDeCompras {
    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adicionar(Produto produto) {
        if (contador >= produtos.length) {
            System.out.println("Carrinho cheio! Não é possível adicionar mais produtos.");
            return;
        }
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public void remover(Produto produto) {
        if (produto == null) return;

        for (int i = 0; i < contador; i++) {
            if (produtos[i] != null && produtos[i].equals(produto)) {
                total -= produtos[i].getValor();

                // desloca elementos para a esquerda
                for (int j = i; j < contador - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }

                produtos[contador - 1] = null; // limpa última posição
                contador--;

                System.out.println("Produto removido: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= contador) {
            System.out.println("Índice inválido.");
            return;
        }

        total -= produtos[indice].getValor();

        for (int i = indice; i < contador - 1; i++) {
            produtos[i] = produtos[i + 1];
        }

        produtos[contador - 1] = null;
        contador--;

        System.out.println("Produto na posição " + indice + " removido.");
    }

    public Produto[] getProdutos() {
        return this.produtos;
    }

    public double getTotal() {
        return total;
    }

    public void listarProdutos() {
        if (contador == 0) {
            System.out.println("Carrinho vazio.");
            return;
        }
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println("Produto no carrinho: R$ " + produto.getValor());
            }
        }
    }
}



