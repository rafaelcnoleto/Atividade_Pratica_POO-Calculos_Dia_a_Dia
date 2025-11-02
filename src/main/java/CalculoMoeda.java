public class CalculoMoeda extends Calculo {
    private double valorOrigem, cotacao, valorConvertido;

    public CalculoMoeda(double valorOrigem, double cotacao) {
        this.valorOrigem = valorOrigem;
        this.cotacao = cotacao;
    }

    @Override
    public void executar() {
        valorConvertido = valorOrigem * cotacao;
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Valor convertido: %.2f (Valor original: %.2f, Cotação: %.4f)%n",
                valorConvertido, valorOrigem, cotacao);
    }
}