package com.ambimetrics.agenda;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
 
/**
*
* Actividad que muestra la vista de detalle en modo portrait
*
*/
public class DetailActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
 
// Debe validarse si el dispositivo se ha cambiado para el modo landscape
// Si s�, se finaliza la actividad y se recarga la actividad inicial
if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
finish();
return;
}
 
setContentView(R.layout.details_activity_layout);
 
Bundle extras = getIntent().getExtras();
if (extras != null) {
String s = extras.getString("value");
TextView view = (TextView) findViewById(R.id.textoDetalle);
view.setText(s);
}

}


public void editarContacto(View view) {
    // Do something in response to button
	Intent intent = new Intent(this, ModificarContactoActivity.class);
	startActivity(intent);

}
}