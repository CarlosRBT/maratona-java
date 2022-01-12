package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calcualdora = new Scanner(System.in);

        String anuncio;
        System.out.println("Informe o nome do anúncio: ");
        anuncio = calcualdora.next();
        String cliente;
        System.out.println("Digite o nome do cliente: ");
        cliente = calcualdora.next();


        double diasInvestidos;
        System.out.println("Digite quantos dias você deseja que o anúncio esteja ativo:");
        diasInvestidos = calcualdora.nextInt();
        double valorInvestido;
        System.out.println("Digite o valor em reais que você deseja investir: ");
        valorInvestido = calcualdora.nextDouble();

        double visualizacaoOriginal = (((diasInvestidos * valorInvestido) * 30) * 4);
        System.out.println("A quantidade de visualizações originais são de:  " + visualizacaoOriginal);

        double quantidadeMaximaCliques = (visualizacaoOriginal * 0.12);
        System.out.println("A quantidade máxima de cliques são de: " + quantidadeMaximaCliques);

        double compartilahmentoPorCliques = (quantidadeMaximaCliques * 0.15);
        System.out.println("A quantidade máxima de compartilhamento por cliques são de: " + compartilahmentoPorCliques);

        double visualizacoesPorClique = (compartilahmentoPorCliques * 40);
        System.out.println("A quantidade de visualização por cliques são de: " + visualizacoesPorClique);

        double quantidadeMaximaCompartilhamentos = (compartilahmentoPorCliques + (visualizacaoOriginal * 0.13));
        System.out.println("A quantidade máxima de compartilahmento do anúncio original mais compartilhamentos por cliques são de: " + quantidadeMaximaCompartilhamentos);

        double quantidadeMaximaVisualizacao = (visualizacaoOriginal + visualizacoesPorClique + quantidadeMaximaCompartilhamentos);
        System.out.println("A quantidade máxima de visualizaçaões são de : " + quantidadeMaximaVisualizacao);

        System.out.println("O nome do anúncio é " + anuncio);
        System.out.println("O nome do cliente é " + cliente);
        System.out.println("O investimento por dia é de " + diasInvestidos + " reais");
    }
}
