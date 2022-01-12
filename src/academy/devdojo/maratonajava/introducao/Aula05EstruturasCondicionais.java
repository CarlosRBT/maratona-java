package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado comprar bebida");
        }
    }
}
// ! = negação (! se não)
// if  é obrigatório retornar valor boolean