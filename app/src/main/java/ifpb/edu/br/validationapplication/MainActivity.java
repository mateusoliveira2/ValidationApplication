package ifpb.edu.br.validationapplication;

import android.app.Activity;
import android.app.admin.DeviceAdminInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends Activity {


    static TextView txtInfo;
    static EditText editNome;
    static EditText editEnd;
    static DatePicker datepicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (EditText) findViewById(R.id.editNome);
        editEnd = (EditText) findViewById(R.id.editEnd);
        txtInfo = (TextView) findViewById(R.id.txtInfo);
        datepicker = (DatePicker) findViewById(R.id.datepicker);
        Button btnEnv = (Button) findViewById(R.id.btnEnv);
        
        btnEnv.setOnClickListener(new OnClickEnviar(this));
    }
}
