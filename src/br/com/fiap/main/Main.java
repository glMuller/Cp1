package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

// Gabriel Lourenço Müller RM561995
// André Emygdio Ferreira RMXXXXXX
// João Victor RMXXXXXX

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar();
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeAcademia;
        int numeroDeMoradores;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite a renda familiar bruta: ");
            rendaFamiliar = scan.nextDouble();
            System.out.println("Digite o número de moradores; ");
            numeroDeMoradores = scan.nextInt();
            System.out.println("Digite o valor da conta de luz: ");
            gastoComLuz = scan.nextDouble();
            System.out.println("Digite o valor da conta de Água: ");
            gastoComAgua = scan.nextDouble();
            System.out.println("Digite o valor da conta de Internet: ");
            gastoComInternet = scan.nextDouble();
            System.out.println("Digite o valor da mensalidade da academia: ");
            valorMensalidadeAcademia = scan.nextDouble();
           //atribuir valores aos objetos
            despesa.rendaFamiliar = rendaFamiliar;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeAcademia = valorMensalidadeAcademia;
            //exibindo os valores e resultados
            System.out.printf("renda bruta familiar: R$ %.3f \nGasto da conta de luz: %.3f \nGasto da conta de Água: %.3f \nGasto com conta de Internet %.3f \nGasto com a mensalidade da academia: %.3f \nRenda familiar líquida: %.3f", despesa.rendaFamiliar, despesa.gastoComLuz, despesa.gastoComAgua, despesa.gastoComInternet, despesa.valorMensalidadeAcademia, despesa.calcularRendaFamiliarLiquida());
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
            throw new RuntimeException(e);
        }
    }

}
