import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BlocoDeNotas bloco = new BlocoDeNotas();
        int opcao = -1;
        while (opcao != 0) {
            try {

                System.out.println("\n== BLOCO DE NOTAS ==");
                System.out.println("1 - Adicionar anotação");
                System.out.println("2 - Editar anotação");
                System.out.println("3 - Apagar anotação");
                System.out.println("4 - Buscar anotação");
                System.out.println("5 - Listar anotações");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Digite a anotação: ");
                        String texto = sc.nextLine();
                        bloco.adicionarAnotacao(texto);
                        System.out.println("Anotação adicionada com sucesso!");
                        break;

                    case 2:
                        System.out.print("ID da anotação para editar: ");
                        int idEditar = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Novo texto: ");
                        String novoTexto = sc.nextLine();
                        bloco.editarAnotacao(idEditar, novoTexto);
                        System.out.println("Anotação editada!");
                        break;

                    case 3:
                        System.out.print("ID da anotação para apagar: ");
                        int idApagar = sc.nextInt();
                        sc.nextLine();
                        bloco.apagarAnotacao(idApagar);
                        System.out.println("Anotação apagada!");
                        break;

                    case 4:
                        System.out.print("Texto para buscar: ");
                        String busca = sc.nextLine();
                        ArrayList<Anotacao> resultados = bloco.buscar(busca);

                        if (resultados.isEmpty()) {
                            System.out.println("Nenhuma anotação encontrada.");
                        } else {
                            for (Anotacao a : resultados) {
                                System.out.println(a);
                            }
                        }
                        break;

                    case 5:
                        bloco.listarImprimir();
                        break;

                    case 0:
                        System.out.println("Encerrando programa...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}




