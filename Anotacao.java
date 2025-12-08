import java.time.LocalDate;

public class Anotacao {
    String textoAnotacao;
    int numeroid;
    LocalDate dataCriacao;
    boolean apagada;

    public Anotacao(String texto, int id) {
        this.textoAnotacao = texto;
        this.numeroid = id;
        this.dataCriacao = LocalDate.now();
        this.apagada = false;


    }

    public String getTextoAnotacao() {
        return textoAnotacao;
    }

    public void setTextoAnotacao(String textoAnotacao) {
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
    } @Override
    public String toString() {
        return "ID: " + numeroid +
                " | Data: " + dataCriacao +
                " | Texto: " + textoAnotacao +
                " | Apagada: " + apagada;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Anotacao other = (Anotacao) obj;

        return this.numeroid == other.numeroid;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numeroid);
    }

}

