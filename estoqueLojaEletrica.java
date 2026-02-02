import java.util.ArrayList;
import java.util.List;

//
class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String loja() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Categoria: " + categoria + " | Preço: R$ " + preco;
    }
}

//
public class estoqueLojaEletrica {
    public static void main(String[] args) {
        // Lista de fios
        List<Produto> fios = new ArrayList<>();
        fios.add(new Produto("FIO 5MM", "Fios", 15.50));
        fios.add(new Produto("FIO 10MM", "Fios", 25.00));
        fios.add(new Produto("FIO 3MM", "Fios", 10.00));

        // Lista de ferramentas
        List<Produto> ferramentas = new ArrayList<>();
        ferramentas.add(new Produto("Alicate", "Ferramentas", 20.00));
        ferramentas.add(new Produto("Chave de Fenda", "Ferramentas", 12.00));
        ferramentas.add(new Produto("Equipamento de EPI Padrão", "Ferramentas", 50.00));
        ferramentas.add(new Produto("Fita Isolante", "Ferramentas", 5.00));
        ferramentas.add(new Produto("Martelo", "Ferramentas", 18.00));
        ferramentas.add(new Produto("Chave Teste", "Ferramentas", 30.00));

        // Exibir organização da loja
        System.out.println("=== LOJA DE MATERIAIS ELÉTRICOS ===");
        System.out.println("\n--- Seção de Fios ---");
        for (Produto fio : fios) {
            System.out.println(fio);
        }

        System.out.println("\n--- Seção de Ferramentas ---");
        for (Produto ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }


        double totalFios = 0.0;
        for (Produto fio : fios) {
            totalFios += fio.getPreco();
        }
        double totalFerramentas = 0.0;
        for (Produto ferramenta : ferramentas) {
            totalFerramentas += ferramenta.getPreco();
        }
        System.out.println("\nTotal de preços em Fios: R$ " + totalFios);
        System.out.println("Total de preços em Ferramentas: R$ " + totalFerramentas);
    }
}