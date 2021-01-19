package es.ua.jtech.habla;

import java.util.ArrayList;

import es.ua.jtech.daa.habla.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadHabla extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
	
	private static final int REQUEST_CODE = 1;

    TextView    mText;
    Button      mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initUI();
    }

    private void initUI() {
        mText = (TextView)this.findViewById(R.id.texto);

        mButton = (Button)this.findViewById(R.id.boton);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Init Text to Speech
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            // Mostrar los resultados obtenidos en el campo texto
        }
    }

}