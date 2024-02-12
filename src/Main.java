import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resposta;
        List<String> curso = new ArrayList<>();
        List<String> professor = new ArrayList<>();


        do {
            System.out.println("Menu de opção:");
            System.out.println("(1) Listar curso / professor \n(2) Adicionar \n(0) Sair");
            resposta = scanner.nextInt();
            scanner.nextLine();
            if(resposta == 0){
                break;
            } else if (resposta == 1){
                System.out.println("Lista de cursos:");
                for(int i = 0; i < curso.size(); i++){
                    System.out.println(i + " " + curso.get(i));
                }

                System.out.println("--------------");
                System.out.println("Lista de professores:");
                for(int i = 0; i < professor.size(); i++){
                    System.out.println(i + " " + professor.get(i));
                }
                System.out.println("--------------");

            }else if(resposta == 2){
                System.out.println("Informar curso");
                curso.add(scanner.nextLine());
                System.out.println("Informar professor");
                professor.add(scanner.nextLine());

            }else {
                System.out.println("Digite uma opção válida");
            }
        } while(true);



    }


}

