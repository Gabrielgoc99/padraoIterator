

public class Veiculo {

    private String nome;
    private boolean estoque;

    public Veiculo(String nome, boolean estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }
}