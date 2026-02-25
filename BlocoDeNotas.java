import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList<Anotacao> anotacoes;

    public BlocoDeNotas() {
        anotacoes = new ArrayList<>();
    }

    public void adicionarAnotacao(String textoAnotacao) throws Exception {
        int numeroid = anotacoes.size();
        Anotacao nova = new Anotacao(textoAnotacao, numeroid);
        anotacoes.add(nova);
    }

    public void editarAnotacao(int numeroid, String novoTexto) throws Exception {
        for (Anotacao a : anotacoes) {
            if (a.getNumeroid() == numeroid && !a.isApagada()) {
                a.setTextoAnotacao(novoTexto);
                return;
            }
        }
        throw new Exception("Anotação não encontrada ou apagada.");
    }

    public void apagarAnotacao(int numeroid) throws Exception {
        for (Anotacao a : anotacoes) {
            if (a.getNumeroid() == numeroid && !a.isApagada()) {
                a.apagar();
                return;
            }
        }
        throw new Exception("Anotação não encontrada.");
    }

    public ArrayList<Anotacao> buscar(String texto) throws Exception {

        if (texto == null || texto.trim().isEmpty()) {
            throw new Exception("Texto de busca inválido!");
        }

        ArrayList<Anotacao> resultados = new ArrayList<>();

        for (Anotacao a : anotacoes) {
            if (!a.isApagada() &&
                a.getTextoAnotacao().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(a);
            }
        }

        return resultados;
    }

    public void listarImprimir() throws Exception {

        if (anotacoes.isEmpty()) {
            throw new Exception("Não existem anotações cadastradas.");
        }

        System.out.println("---- Lista de Anotações ----");

        for (Anotacao a : anotacoes) {
            if (!a.isApagada()) {
                System.out.println(a);
            }
        }
    }
}

