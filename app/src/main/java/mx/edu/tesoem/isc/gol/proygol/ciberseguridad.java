package mx.edu.tesoem.isc.gol.proygol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ciberseguridad extends AppCompatActivity implements View.OnClickListener {
    Button btnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciberseguridad);
        btnr=(Button) findViewById(R.id.btnreg);
        btnr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent pantalla1= new Intent(this,menu.class);
        startActivity(pantalla1);
        finish();
    }
}
