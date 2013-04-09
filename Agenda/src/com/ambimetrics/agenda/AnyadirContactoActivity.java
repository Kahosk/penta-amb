package com.ambimetrics.agenda;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AnyadirContactoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anyadir_contacto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.anyadir_contacto, menu);
		return true;
	}

}
