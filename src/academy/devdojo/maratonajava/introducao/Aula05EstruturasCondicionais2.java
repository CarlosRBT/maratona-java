package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        //idade menor que 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade > 18 categoria adulto
        // if = Se
        // else if = Se não se
        // else = se não

        int idade = 45;
        if(idade < 15){
            System.out.println("Categoria infantil");
        }else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else {
            System.out.println("Categoria adulto");
        }

    }
}
