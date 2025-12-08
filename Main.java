import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        BlocoDeNotas bloco = new BlocoDeNotas();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("==BLOCO DE NOTAS==");
            System.out.println("1 - Adicionar anotação");
            System.out.println("2 - Editar anotação");
            System.out.println("3 - Apagar anotação");
            System.out.println("4 - Buscar anotação");
            System.out.println("5 - Listar todas as anotações");
            System.out.println("0 - Sair");
            System.out.println("Escolha alguma opção");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite alguma anotação");
                    String texto = sc.nextLine();
                    bloco.adicionarAnotacao(texto);
                    break;
                case 2:
                    System.out.println("Qual o id da anotação que você deseja editar?");
                    int idEditar = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o novo texto");
                    String novoTexto = sc.nextLine();
                    bloco.editarAnotacao(idEditar, novoTexto);
                    break;
                case 3:
                    System.out.println("Digite o ID da anotação que você deseja apagar");
                    int idApagar = sc.nextInt();
                    sc.nextLine();
                    bloco.apagarAnotacao(idApagar);
                    break;
                case 4:
                    System.out.println("Digite o texto para conseguir buscar");
                    String buscar = sc.nextLine();
                    ArrayList<Anotacao> resultados = bloco.buscar(buscar);
                    if (resultados.isEmpty()) {
                        System.out.println("Nenhuma anotação encontrada");
                    } else {
                        System.out.println("Resultados:");
                        for (Anotacao a : resultados) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Lista completa:");
                    bloco.listarImprimir();
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");

            }
        }
    }
    }



