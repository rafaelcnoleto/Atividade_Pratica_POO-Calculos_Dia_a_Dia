public class CalculoEnergiaEletrica extends Calculo {
    private double consumo;  // kWh
    private double precoKwh;
    private double total;

    public CalculoEnergiaEletrica(double consumo, double precoKwh) {
        this.consumo = consumo;
        this.precoKwh = precoKwh;
    }

    @Override
    public void executar() {
        total = consumo * precoKwh;
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Valor consumo energia: R$ %.2f (Consumo: %.2f kWh, Preço por kWh: R$ %.2f)%n",
                total, consumo, precoKwh);
    }
}