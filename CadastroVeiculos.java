import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        OUTER:
        while (true) {
            System.out.println("Digite '1' para inserir uma moto, '2' para inserir um carro ou '0' para sair:");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 0 -> {
                    break OUTER;
                }
                case 1 ->                     {
                        System.out.println("Digite o modelo da moto:");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite o preço da moto:");
                        double preco = scanner.nextDouble();
                        System.out.println("Digite o ano da moto:");
                        int ano = scanner.nextInt();
                        Moto moto = new Moto(modelo, preco, ano);
                        veiculos.add(moto);
                    }
                case 2 ->                     {
                        System.out.println("Digite o modelo do carro:");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite o preço do carro:");
                        double preco = scanner.nextDouble();
                        System.out.println("Digite a quilometragem do carro:");
                        double km = scanner.nextDouble();
                        Carro carro = new Carro(modelo, preco, km);
                        veiculos.add(carro);
                    }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        double totalPrecoAntes = calcularTotalPreco(veiculos);
        System.out.println("Total de preços dos veículos no cadastro (antes dos ajustes): R$" + totalPrecoAntes);

        veiculos.forEach(veiculo -> {
            switch (veiculo) {
                default -> {
                }
            }
        });

        double totalPrecoDepois = calcularTotalPreco(veiculos);
        System.out.println("Total de preços dos veículos no cadastro (após os ajustes): R$" + totalPrecoDepois);
    }

    public static double calcularTotalPreco(List<Veiculo> veiculos) {
        double total = 0.0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }
}