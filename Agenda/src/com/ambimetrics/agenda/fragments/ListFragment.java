package com.ambimetrics.agenda.fragments;

import com.ambimetrics.agenda.DetailActivity;
import com.ambimetrics.agenda.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
 
/**
*
* Fragment que se carga inicialmente con la vista principal, es decir, con el listado inicial
*
* @author carlos.munoz
*
*/
public class ListFragment extends android.app.ListFragment {
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
 
}
 
@Override
//se sobreescribe este método como el que siempre "carga" la información a mostrar en el fragment
public void onActivityCreated(Bundle savedInstanceState) {
super.onActivityCreated(savedInstanceState);
String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
"Linux", "OS/2" };
ArrayAdapter<String> adapter =
new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
 
setListAdapter(adapter);
}
 
@Override
//al hacer tap en algun elemento de la vista, setea el texto del elemento en el nuevo fragment
public void onListItemClick(ListView l, View v, int position, long id) {
String item = (String) getListAdapter().getItem(position);
DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detalleFragment);
if (fragment != null && fragment.isInLayout()) {
fragment.setText(item);
} else {
Intent intent = new Intent(getActivity().getApplicationContext(), DetailActivity.class);
intent.putExtra("value", item);
startActivity(intent);
}
}
}