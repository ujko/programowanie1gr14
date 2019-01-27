package day6.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matchers {
    /*
        regex
        .    dowolny znak
        \w   dowolna litera
        \d   dowolna cyfra
        *   wystąpienie 0 lub wiecej razy
        +   wystąpienie 1 lub więcej razy
        ?   wystąpienie 0 lub 1 razy
        \s  biały znak
        ()  grupa
        []  [0-3] cyfry od 0 do 3
        {5} - ilosc znaków
        ^ - musi zaczynac
        $ - musi sie konczyc

     */

    /*
    [\w\d_.]+@[\w\d_]+.com
     */

    public static void main(String[] args) {
        boolean b = new Matchers().test("test@gmail.com.pl");
        System.out.println(b ? "Adres jest poprawny" : "Błędny adres");
    }

    public boolean test(String email) {
        String matcher = "[\\w\\d_.]+@[\\w\\d_]+.com.?[a-z]*";
        Pattern pattern = Pattern.compile(matcher);
        Matcher m = pattern.matcher(email);
        //return m.find();   zwraca true jesli ciag wystepuje w srodku
        return m.matches();   // zwraca true jesli caly ciag odpowiada
    }

}
