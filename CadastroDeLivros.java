import br.com.livraria.moon.teste.Autor;


public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("João da Silva");
        autor.setEmail("Joao@email.com");
        autor.setCpf("123.456.789-00");

        Livro livro = new Livro(autor) {
            @Override
            public boolean aplicaDescontoDe(double porcentagem) {
                return false;
            }
        };
        livro.setNome("Aprendendo Java");
        livro.setDescricao("Um guia completo para iniciantes em Java.");
        livro.setValor(59.90);
        livro.setIsbn("978-3-16-148410-0");
        livro.setAutor(autor);

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Maria Oliveira");
        outroAutor.setEmail("Maria@email.com");
        outroAutor.setCpf("987.654.321-00");

        Livro outroLivro = new Livro(outroAutor) {
            @Override
            public boolean aplicaDescontoDe(double porcentagem) {
                return false;
            }
        };
        outroLivro.setNome("Programação Avançada em Java");
        outroLivro.setDescricao("Técnicas avançadas para programadores experientes.");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-3-16-148410-1");
        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();

        Livro livro1 = new Livro(autor) {
            @Override
            public boolean aplicaDescontoDe(double porcentagem) {
                return false;
            }
        };
        Livro livro2 = new Livro(outroAutor) {
            @Override
            public boolean aplicaDescontoDe(double porcentagem) {
                return false;
            }
        };

        System.out.println("Autor: " + livro1.getAutor().getNome());
        System.out.println("Autor: " + livro2.getAutor().getNome());
    }
}

