import br.com.livraria.moon.teste.Editora;
import br.com.livraria.moon.Produto;

public class Revista implements Produto {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    private double valor;
    private Editora editora;

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) { return false; } // máximo 10%
    double desconto = getValor() * porcentagem;
        setValor(getValor() - getValor() * porcentagem);
        System.out.println("Aplicando desconto na revista.");
        return true;
    }
}


