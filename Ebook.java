import br.com.livraria.moon.teste.Autor;
import br.com.livraria.moon.Promocional;


public class Ebook extends Livro implements Promocional {
    private String watermark;

    public Ebook(Autor autor) {
        super(autor);
        this.impresso = false;
    }




    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) return false; // máximo 15%
        setValor(getValor() - getValor() * porcentagem);
        return true;
    }
}