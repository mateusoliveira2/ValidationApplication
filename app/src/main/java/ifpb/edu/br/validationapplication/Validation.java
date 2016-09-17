package ifpb.edu.br.validationapplication;

import android.util.Log;
import android.widget.DatePicker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eddie on 16/09/16.
 */
public class Validation {

    static String nome =  "[A-Za-záàâãéèêíïóôõöúüçñÁÀÂÃÉÈÍÏÓÔÕÖÚÜÇÑ ]*";
    static String end = "[0-9a-zA-ZáàâãéèêíïóôõöúüçñÁÀÂÃÉÈÍÏÓÔÕÖÚÜÇÑ .,/-ºª: ]*";


    public static boolean nomeValidate(String s){
        boolean v = false;
        if(!s.isEmpty()) {
            Pattern p = Pattern.compile(nome);
            Matcher m = p.matcher(s);
            v = m.matches();
        }

        if(v && !s.isEmpty()) {
            String nomeSplit[] = s.split("\\s+");
            if (nomeSplit.length > 1) {
                for (int i = 0; i < nomeSplit.length; i++) {
                    if (nomeSplit[i].matches("[a-zA-Z][.]") || nomeSplit[i].matches("[a-zA-Z]"))
                        v = true;
                }
            }else{
                if(nomeSplit[0].matches("[a-zA-Z]{1}"))
                    v = false;
            }
        }
        return v;
    }

    public static boolean endValidate(String s){
        boolean v = false;
        if(!s.isEmpty()) {
            Pattern p = Pattern.compile(end);
            Matcher m = p.matcher(s);
            v = m.matches();
        }
        return v;
    }

    public static boolean nascValidate(int year){
        int minYear = 1900;
        int maxYear = 2016;
        if (year < minYear || year > maxYear)
            return false;
        else
            return true;
    }
}
