package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        //doar se salário > 5000

        double salario = 14000;
        String mensagemDoar = "Eu vou doar 500 reais para o devdojo";
        String mensagemNaoDoar = "Eu ainda não tenho condições, mas vou ter";
        String resultado;
        if(salario > 5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}


