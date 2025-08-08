import java.util.Scanner;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro() {
            @Override
            public boolean aplicaDescontoDe(double porcentagem) {
                return false;
            }
        };
        livro.setValor(59.90);

        System.out.println("Valor atual: R$ " + livro.getValor());

        System.out.print("Digite seu cupom (ex: CUPOM10, CUPOM15): ");
        String cupom = scanner.nextLine().trim().toUpperCase();

        double porcentagem = obterPorcentagemDoCupom(cupom);

        if (porcentagem == 0.0) {
            System.out.println("Cupom inválido!");
        } else if (!livro.aplicaDescontoDe(porcentagem)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: R$ " + livro.getValor());
        }

        scanner.close();


        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: R$ " + livro.getValor());
        }

    }
    public static double obterPorcentagemDoCupom(String cupom) {
        if (cupom.startsWith("CUPOM")) {
            try {
                int valor = Integer.parseInt(cupom.substring(5)); // pega só o número
                if (valor % 5 == 0 && valor <= 30) {
                    return valor / 100.0; // transforma 10 em 0.1, 15 em 0.15 etc
                }
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }
        return 0.0;
    }


    }

