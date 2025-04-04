package br.com.fiap.bean;
// Gabriel Lourenço Müller RM561995
// André Emygdio Ferreira RMXXXXXX
// João Victor RMXXXXXX
public class DespesaFamiliar {
    //atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeAcademia;
    public double rendaFamiliarLiquida;
    //metodos
    public double calcularTotalDespesas(){
        return (numeroDeMoradores * valorMensalidadeAcademia) + gastoComAgua + gastoComInternet + gastoComLuz;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendafamiliarLiquida = rendaFamiliar - calcularTotalDespesas();
        return rendafamiliarLiquida;
    }
}
