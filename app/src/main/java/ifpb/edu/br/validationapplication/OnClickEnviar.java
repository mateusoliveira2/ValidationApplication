package ifpb.edu.br.validationapplication;

import android.util.Log;
import android.view.View;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eddie on 16/09/16.
 */
public class OnClickEnviar implements View.OnClickListener{

    MainActivity main;

    public OnClickEnviar(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {

        String nome = main.editNome.getText().toString();
        String end  = main.editEnd.getText().toString();
        int year  = main.datepicker.getYear();


        boolean nomeValidado = Validation.nomeValidate(nome);
        boolean endValidado = Validation.endValidate(end);
        boolean nascValidado = Validation.nascValidate(year);


        String msg = " ";

        if(nomeValidado)
            msg += "\n Nome válido";
        else
            msg += "\n Nome inválido";

        if(endValidado)
            msg += "\n Endereço válido";
        else
            msg += "\n Endereço inválido";

        if(nascValidado)
            msg += "\n Data válida";
        else
            msg += "\n Data inválida";

        main.txtInfo.setText(msg);


    }
}
