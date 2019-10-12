package mx.edu.tesoem.isc.gol.proygol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1=(Button) findViewById(R.id.btnint);
        btn2=(Button) findViewById(R.id.btncon);
        btn3=(Button) findViewById(R.id.btnobj);
        btn4=(Button) findViewById(R.id.btnries);
        btn5=(Button) findViewById(R.id.btnque);
        btn6=(Button) findViewById(R.id.btntip);
        btn7=(Button) findViewById(R.id.btninf);
        btn8=(Button) findViewById(R.id.btnace);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==btn1.getId()) {
            Intent introduccion = new Intent(this, introduccion.class);
            startActivity(introduccion);
            finish();
        }
        if (v.getId()==btn2.getId()) {
            Intent concepto = new Intent(this, ciberseguridad.class);
            startActivity(concepto);
            finish();
        }
        if (v.getId()==btn3.getId()) {
            Intent objetivos = new Intent(this, objetivos.class);
            startActivity(objetivos);
            finish();
        }
        if (v.getId()==btn4.getId()) {
            Intent riego = new Intent(this, riesgos.class);
            startActivity(riego);
            finish();
        }
        if (v.getId()==btn5.getId()) {
            Intent que = new Intent(this, ataque.class);
            startActivity(que);
            finish();
        }
        if (v.getId()==btn6.getId()) {
            Intent tipos = new Intent(this, tipos.class);
            startActivity(tipos);
            finish();
        }
        if (v.getId()==btn7.getId()) {
            Intent info = new Intent(this, info.class);
            startActivity(info);
            finish();
        }
        if (v.getId()==btn8.getId()) {
            Intent acerca = new Intent(this, acerca.class);
            startActivity(acerca);
            finish();
        }
    }



}
