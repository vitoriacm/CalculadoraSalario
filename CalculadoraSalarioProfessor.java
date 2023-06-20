
import java.util.Scanner;

public class CalculadoraSalarioProfessor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome Professor");
        String nome = teclado.nextLine();

        System.out.println("-------Selecione o seu Regime de pagamento: CLT, Horista ou PJ-----");
        String regimeDePagamento = teclado.nextLine();

        System.out.println("Selecione sua opção do Regime de pagamento:");
        System.out.println("1- CLT");
        System.out.println("2- Horista");
        System.out.println("3- PJ");
        int opcao = teclado.nextInt();

        double ValorReceber = 0.0;

        if (opcao == 1) {
            System.out.println("--------------CLT----------------");
            System.out.println("Regime de pagamento CLT:");
            System.out.println("Digite o Salário Mensal");
            double salarioMensalProfessor = teclado.nextDouble();
            ValorReceber = salarioMensalProfessor;
        } else if (opcao == 2) {
            System.out.println("--------------Horista--------------");
            System.out.println("Regime de pagamento HORISTA");
            System.out.println("Digite a quantidade de Horas trabalhadas:");
            double quantidadeHorasTrabalhadas = teclado.nextDouble();
            System.out.println("Digite o Valor da sua Hora de trabalho:");
            double valorDaHoraDeTrabalho = teclado.nextDouble();
            ValorReceber = quantidadeHorasTrabalhadas * valorDaHoraDeTrabalho;
        } else if (opcao == 3) {
            System.out.println("--------------PJ--------------");
            System.out.println("Regime de pagamento PJ");
            System.out.println("Digite o valor do contrato");
            double valorContrato = teclado.nextDouble();
            ValorReceber = valorContrato;
        } else {

            System.out.println("Opção inválida.");
        }

        System.out.printf("O professor(a) %s devera Receber o Valor de R$: %.2f ", nome, ValorReceber);

        teclado.close();

    }

}