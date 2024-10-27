import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        List<Integer> numeros = new ArrayList<>();
       

        System.out.println("Digite os números para ordenar:");
        String[] entrada = scanner.nextLine().split(" ");
        for (String s : entrada) {
            numeros.add(Integer.valueOf(s));
        }

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> contexto.setEstrategia(new OrdenacaoBubbleSort());
            case 2 -> contexto.setEstrategia(new OrdenacaoSelectionSort());
            case 3 -> contexto.setEstrategia(new OrdenacaoInsertionSort());
            default -> {
                System.out.println("Escolha inválida.");
                return;
            }
        }

        contexto.executarOrdenacao(numeros);
    }
}
