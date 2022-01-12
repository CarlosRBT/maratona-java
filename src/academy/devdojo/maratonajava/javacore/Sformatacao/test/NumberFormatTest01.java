package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nft = new NumberFormat[4];
        nft[0] = NumberFormat.getInstance();
        nft[1] = NumberFormat.getInstance(localeBR);
        nft[2] = NumberFormat.getInstance(localeJP);
        nft[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_0002130;
        for (NumberFormat numberFormat : nft) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
