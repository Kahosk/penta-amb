package com.ambimetrics.agenda;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AgendaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agenda);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.agenda, menu);
		return true;
	}
	
	public void editarContacto(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, ModificarContactoActivity.class);
		startActivity(intent);

	}
	
}
