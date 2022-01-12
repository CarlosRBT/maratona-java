package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_Por_Cento = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto da televisão");
        return this.valor * IMPOSTO_Por_Cento;
    }

}
