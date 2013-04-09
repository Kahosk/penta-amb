package com.ambimetrics.agenda;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ModificarContactoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modificar_contacto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.modificar_contacto, menu);
		return true;
	}

}
