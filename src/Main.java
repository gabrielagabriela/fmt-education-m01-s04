import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resposta;
        List<String> curso = new ArrayList<>();
        List<String> professor = new ArrayList<>();
        List<String> cursoConcluido = new ArrayList<>();

        Curso curso01 = new Curso();
        Professor professor01 = new Professor();
        System.out.println(curso01.notas());
        System.out.println(professor01.ensinar());

        do {
            System.out.println("Menu de opção:");
            System.out.println("(1) Listar curso / professor \n(2) Adicionar \n(3) Remover \n(4) Marcar como concluído \n(5) Listar concluídos \n(0) Sair");
            resposta = scanner.nextInt();
            scanner.nextLine();
            if (resposta == 0) {
                System.out.println("Finalizado");
            } else if (resposta == 1) {
                listarCursoEProfessor(curso, professor);
            } else if (resposta == 2) {
                adicionarCursoEProfessor(curso, professor, scanner);
            }else if(resposta == 3){
                int indice = listarPedirIndice(curso, professor,scanner);
                removerItemLista(indice,  curso,  professor);
                //System.out.println("Indice do item escolhido: " + indice);
            } else if(resposta == 4){
                marcarComoConcluido(curso, professor, cursoConcluido, scanner);
            } else if(resposta == 5){
                listarConcluidos(cursoConcluido);
            }
            else {
                System.out.println("Digite uma opção válida");
            }
        } while (resposta != 0);


    }

    private static void listarCursoEProfessor(List<String> curso, List<String> professor) {
        System.out.println("Lista de cursos:");
        for (int i = 0; i < curso.size(); i++) {
            System.out.println((i + 1) + ". " + curso.get(i));
        }

        System.out.println("--------------");
        System.out.println("Lista de professores:");
        for (int i = 0; i < professor.size(); i++) {
            System.out.println((i + 1) + ". " + professor.get(i));
        }
        System.out.println("--------------");
    }

    private static void adicionarCursoEProfessor(List<String> curso, List<String> professor, Scanner scanner) {
        System.out.println("Informar curso");
        curso.add(scanner.nextLine());
        System.out.println("Informar professor");
        professor.add(scanner.nextLine());
        System.out.println("Curso e professor adicionados com sucesso!");
    }

    private static int listarPedirIndice(List<String> curso, List<String> professor, Scanner scanner) {
        listarCursoEProfessor(curso, professor);
        int indice = -1;
        while (true) {
            System.out.println("Escolha um item da lista");
            String itemEscolhido = scanner.nextLine();
            for (int i = 0; i < curso.size(); i++) {
                if (itemEscolhido.equalsIgnoreCase(curso.get(i)) || itemEscolhido.equalsIgnoreCase(professor.get(i))) {
                    indice = i;
                    break;
                }
            }
            if (indice != -1) {
                break;
            } else {
                System.out.println("Item não existente, escolha outro");
            }
        }
        return indice;
    }

    private static void removerItem(int indice, List<String> curso, List<String> professor ){
        for(int i = 0; i < curso.size(); i++){
            if(indice == i){
                curso.remove(i);
                professor.remove(i);
            }
        }
    }
    private static void removerItemLista(int indice, List<String> curso, List<String> professor){
        removerItem(indice, curso, professor);
        System.out.println("item removido com sucesso!");
    }

    private static void marcarComoConcluido(List<String> curso, List<String> professor, List<String> cursoConcluido, Scanner scanner){
        int escolhido = listarPedirIndice(curso, professor,  scanner);
        cursoConcluido.add(curso.get(escolhido));
        System.out.println("Curso incluído na lista de concluídos!");
        removerItem(escolhido, curso, professor);
    }

    private static void listarConcluidos(List<String> cursoConcluido){
        System.out.println("Lista de cursos concluídos");
        for(String curso: cursoConcluido ){
            System.out.println(curso);
        }
    }
}


