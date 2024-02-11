import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int continuar;
        List<String> curso = new ArrayList<>();
        List<String> professor = new ArrayList<>();

        do {
            System.out.println("Informar curso");
            curso.add(scanner.nextLine());
            System.out.println("Informar professor");
            professor.add(scanner.nextLine());
            System.out.println("Deseja continuar? 1 (sim) / 0 (nao)");
            continuar = scanner.nextInt();
            scanner.nextLine();

        } while (continuar != 0);

        System.out.println("--------------");
        System.out.println("Lista de cursos:");
        for (String i : curso) {
            System.out.println(i);
        }

        System.out.println("--------------");
        System.out.println("Lista de professores:");
        for (String i : professor) {
            System.out.println(i);
        }


    }
}
