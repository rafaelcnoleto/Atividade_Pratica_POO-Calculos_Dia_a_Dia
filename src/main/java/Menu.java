import java.util.*;

public class Menu {
    private Scanner in = new Scanner(System.in);
    private List<Calculo> lista = new ArrayList<>();

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nSelecione o cálculo desejado:");
            System.out.println("1 - Salário Líquido");
            System.out.println("2 - IMC");
            System.out.println("3 - Conversão de Moedas");
            System.out.println("4 - Juros Simples");
            System.out.println("5 - Juros Compostos");
            System.out.println("6 - Consumo de Energia Elétrica");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = in.nextInt();
            in.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    criarCalculoSalario();
                    break;
                case 2:
                    criarCalculoIMC();
                    break;
                case 3:
                    criarCalculoMoeda();
                    break;
                case 4:
                    criarJurosSimples();
                    break;
                case 5:
                    criarJurosCompostos();
                    break;
                case 6:
                    criarCalculoEnergia();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void criarCalculoSalario() {
        System.out.print("Salário bruto (R$): ");
        double bruto = in.nextDouble();
        System.out.print("Descontos (R$): ");
        double desconto = in.nextDouble();
        System.out.print("Benefícios (R$): ");
        double beneficio = in.nextDouble();
        CalculoSalario calc = new CalculoSalario(bruto, desconto, beneficio);
        calc.executar();
        calc.exibirResultado();
        lista.add(calc);
    }

    private void criarCalculoIMC() {
        System.out.print("Peso (kg): ");
        double peso = in.nextDouble();
        System.out.print("Altura (m): ");
        double altura = in.nextDouble();
        CalculoIMC calc = new CalculoIMC(peso, altura);
        calc.executar();
        calc.exibirResultado();
        lista.add(calc);
    }

    private void criarCalculoMoeda() {
        System.out.print("Valor da moeda original: ");
        double valor = in.nextDouble();
        System.out.print("Cotação atual da moeda a converter: ");
        double cotacao = in.nextDouble();
        CalculoMoeda calc = new CalculoMoeda(valor, cotacao);
        calc.executar();
        calc.exibirResultado();
        lista.add(calc);
    }

    private void criarJurosSimples() {
        System.out.print("Capital (R$): ");
        double capital = in.nextDouble();
        System.out.print("Taxa mensal (decimal, ex. 0.05 = 5%): ");
        double taxa = in.nextDouble();
        System.out.print("Tempo (meses): ");
        int tempo = in.nextInt();
        CalculoJurosSimples calc = new CalculoJurosSimples(capital, taxa, tempo);
        calc.executar();
        calc.exibirResultado();
        lista.add(calc);
    }

    private void criarJurosCompostos() {
        System.out.print("Capital (R$): ");
        double capital = in.nextDouble();
        System.out.print("Taxa mensal (decimal, ex. 0.05 = 5%): ");
        double taxa = in.nextDouble();
        System.out.print("Tempo (meses): ");
        int tempo = in.nextInt();
        CalculoJurosCompostos calc = new CalculoJurosCompostos(capital, taxa, tempo);
        calc.executar();
        calc.exibirResultado();
        lista.add(calc);
    }

    private void criarCalculoEnergia() {
        System.out.print("Consumo de energia (kWh): ");
        double consumo = in.nextDouble();
        System.out.print("Preço por kWh (R$): ");
        double preco = in.nextDouble();
        CalculoEnergiaEletrica calc = new CalculoEnergiaEletrica(consumo, preco);
        calc.executar();
        calc.exibirResultado();
        lista.add(calc);
    }
}
