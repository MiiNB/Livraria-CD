import br.com.livraria.moon.Promocional;
import br.com.livraria.moon.teste.Autor;

public class LivroFisico extends Livro implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
        this.impresso = true; // Por padrão, o livro físico é impresso
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05; // taxa fixa de impressão
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false; // máximo 30%
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no livro físico.");
        return true;
    }
}

