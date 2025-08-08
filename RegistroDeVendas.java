import br.com.livraria.moon.teste.Autor;


public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Harper Lee");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("To Kill a Mockingbird");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("To Kill a Mockingbird - Ebook");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(fisico);
        carrinho.adicionar(ebook);

        System.out.println("Total " + carrinho.getTotal());


    }
}

