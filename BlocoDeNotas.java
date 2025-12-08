import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList<Anotacao> anotacoes;

    public BlocoDeNotas() {
        anotacoes = new ArrayList<>();
    }

    public void adicionarAnotacao(String textoAnotacao) {
        int numeroid = anotacoes.size();
        Anotacao nova = new Anotacao(textoAnotacao, numeroid);
        anotacoes.add(nova);
    }

    public void editarAnotacao(int numeroid, String novoTexto) {
        for (Anotacao a : anotacoes) {
            if (a.getNumeroid() == numeroid && !a.isApagada()) {
                a.setTextoAnotacao(novoTexto);
                return;
            }
        }
        System.out.println("Anotação não encontrada ou está apagada!");
    }


    public void apagarAnotacao(int numeroid) {
        for (Anotacao a : anotacoes) {
            if (a.getNumeroid() == numeroid) {
                a.apagar();
                return;
            }
        }
        System.out.println("Anotação não encontrada!");
    }

    public ArrayList<Anotacao> buscar(String texto) {
        ArrayList<Anotacao> resultados = new ArrayList<>();
        if (texto == null) return resultados;

        for (Anotacao a : anotacoes) {
            if (!a.isApagada() && a.getTextoAnotacao().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(a);
            }
        }
        return resultados;
    }

    public ArrayList<Anotacao> listar() {
        ArrayList<Anotacao> lista = new ArrayList<>();

        for (Anotacao a : anotacoes) {
            if (!a.isApagada()) {
                lista.add(a);
            }
        }
        return lista;
    }

    public void listarImprimir() {
        System.out.println("---- Lista de anotações ----");
        for (Anotacao a : anotacoes) {
            if (!a.isApagada()) {
                System.out.println(a);
            }
        }
    }
}

