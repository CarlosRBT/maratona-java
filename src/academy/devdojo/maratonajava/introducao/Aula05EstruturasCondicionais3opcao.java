package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3opcao {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 15000;
        //(condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 reais para o devdojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
