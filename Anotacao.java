import java.time.LocalDate;

public class Anotacao {

    private String textoAnotacao;
    private int numeroid;
    private LocalDate dataCriacao;
    private boolean apagada;

    public Anotacao(String texto, int id) throws Exception {
        setTextoAnotacao(texto); 
        this.numeroid = id;
        this.dataCriacao = LocalDate.now();
        this.apagada = false;
    }

    public String getTextoAnotacao() {
        return textoAnotacao;
    }

    public void setTextoAnotacao(String textoAnotacao) throws Exception {
        if (textoAnotacao == null || textoAnotacao.trim().isEmpty()) {
            throw new Exception("Texto da anotação não pode ser vazio.");
        }
        this.textoAnotacao = textoAnotacao;
    }

    public int getNumeroid() {
        return numeroid;
    }

    public boolean isApagada() {
        return apagada;
    }

    public void apagar() {
        this.apagada = true;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        return "ID: " + numeroid +
               " | Data: " + dataCriacao +
               " | Texto: " + textoAnotacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Anotacao)) return false;
        Anotacao other = (Anotacao) obj;
        return this.numeroid == other.numeroid;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numeroid);
    }
}

