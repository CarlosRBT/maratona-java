package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, desculbra em quantas parcelas ele pode ser parcelado
        //Condicao valor da parcela >=1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorparcela = valorTotal / parcela;
            if (valorparcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorparcela);

        }
    }
}
