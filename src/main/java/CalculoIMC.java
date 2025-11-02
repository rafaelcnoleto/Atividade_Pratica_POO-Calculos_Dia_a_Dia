public class CalculoIMC extends Calculo {
    private double peso;   // kg
    private double altura; // metros
    private double imc;

    public CalculoIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void executar() {
        imc = peso / (altura * altura);
    }

    @Override
    public void exibirResultado() {
        System.out.printf("IMC: %.2f (Peso: %.2f kg, Altura: %.2f m)%n", imc, peso, altura);
    }
}