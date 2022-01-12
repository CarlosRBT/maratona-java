package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nft = new NumberFormat[4];
        nft[0] = NumberFormat.getCurrencyInstance();
        nft[1] = NumberFormat.getCurrencyInstance(localeBR);
        nft[2] = NumberFormat.getCurrencyInstance(localeJP);
        nft[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_0002130;
        for (NumberFormat numberFormat : nft) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
