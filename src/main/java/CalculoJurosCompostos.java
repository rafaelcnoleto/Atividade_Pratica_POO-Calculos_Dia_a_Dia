public class CalculoJurosCompostos extends Calculo {
    private double capital, taxa;
    private int tempoMeses;
    private double montante;

    public CalculoJurosCompostos(double capital, double taxa, int tempoMeses) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempoMeses = tempoMeses;
    }

    @Override
    public void executar() {
        montante = capital * Math.pow(1 + taxa, tempoMeses);
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Montante (Juros Compostos): R$ %.2f (Capital: R$ %.2f, Taxa: %.2f%%, Tempo: %d meses)%n",
                montante, capital, taxa * 100, tempoMeses);
    }
}