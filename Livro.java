import br.com.livraria.moon.teste.Autor;
import br.com.livraria.moon.Produto;
import br.com.livraria.moon.Promocional;


public abstract class Livro implements Produto, Promocional {

    // Atributos privados
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    protected boolean impresso; // acessível para subclasses

    // Construtor com Autor obrigatório
    public Livro(Autor autor) {
        this.autor = autor;
        this.impresso = true; // padrão
        this.isbn = "000-00-00000-00-0"; // valor padrão se quiser
    }

    public Livro() {

    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }


    // Método para mostrar detalhes do livro
    public void mostrarDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("ISBN: " + isbn);

        if (autor != null) {
            autor.mostrarDetalhes();
        }

        System.out.println("-------------------------");
    }


}




