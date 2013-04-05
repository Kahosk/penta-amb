package com.ambimetrics.agenda.fragments;

import com.ambimetrics.agenda.R;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
/*
*
* Fragment que define el comportamiento del detalle de la lista una vez se selecciona un elemento
* en otro Fragment
*
*/
public class DetailFragment extends Fragment {
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
Log.e("Test", "hello");
}
 
@Override
public void onActivityCreated(Bundle savedInstanceState) {
super.onActivityCreated(savedInstanceState);
 
}
 
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
Bundle savedInstanceState) {
View view = inflater.inflate(R.layout.detail_vercontacto, container, false);
return view;
}
 
public void setText(String item) {
TextView view = (TextView) getView().findViewById(R.id.textoDetalle);
view.setText(item);
}
}