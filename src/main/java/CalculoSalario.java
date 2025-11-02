public class CalculoSalario extends Calculo {
    private double salarioBruto, descontos, beneficios, salarioLiquido;

    public CalculoSalario(double salarioBruto, double descontos, double beneficios) {
        this.salarioBruto = salarioBruto;
        this.descontos = descontos;
        this.beneficios = beneficios;
    }

    @Override
    public void executar() {
        salarioLiquido = salarioBruto - descontos + beneficios;
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Salário Líquido: R$ %.2f (Bruto: R$ %.2f, Descontos: R$ %.2f, Benefícios: R$ %.2f)%n",
                salarioLiquido, salarioBruto, descontos, beneficios);
    }
}