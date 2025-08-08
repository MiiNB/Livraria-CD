import br.com.livraria.moon.teste.Autor;

public class MiniLivro extends Livro{
    public MiniLivro(Autor autor) {
        super(autor);
        this.impresso = true; // Por padrão, o mini livro é impresso
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }


}
