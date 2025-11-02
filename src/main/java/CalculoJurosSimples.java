public class CalculoJurosSimples extends Calculo {
    private double capital, taxa;
    private int tempoMeses;  // inteiro, meses
    private double juros;

    public CalculoJurosSimples(double capital, double taxa, int tempoMeses) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempoMeses = tempoMeses;
    }

    @Override
    public void executar() {
        // taxa mensal assumida; juros = capital * taxa * tempo
        juros = capital * taxa * tempoMeses;
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Juros Simples: R$ %.2f (Capital: R$ %.2f, Taxa: %.2f%%, Tempo: %d meses)%n",
                juros, capital, taxa * 100, tempoMeses);
    }
}