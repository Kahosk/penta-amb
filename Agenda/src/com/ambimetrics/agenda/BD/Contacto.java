package com.ambimetrics.agenda.BD;

public class Contacto {
	 
private Integer idContacto;
private String Nombre;
private String Apellidos;
private Integer Telefono;
private String Pais;
private String Provincia;
private String Ciudad;
 
public Contacto(Integer id, String nombre, String apellidos, Integer telefono, String pais, String provincia, String ciudad) {
super();
setID(id);
setNombre(nombre);
setApellidos(apellidos);
setTelefono(telefono);
setPais(pais);
setProvincia(provincia);
setCiudad(ciudad);
}

public Integer getID() {
	return idContacto;
}

public void setID(Integer id) {
	idContacto = id;
}
 

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellidos() {
	return Apellidos;
}

public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}

public Integer getTelefono() {
	return Telefono;
}

public void setTelefono(Integer telefono) {
	Telefono = telefono;
}

public String getPais() {
	return Pais;
}

public void setPais(String pais) {
	Pais = pais;
}

public String getProvincia() {
	return Provincia;
}

public void setProvincia(String provincia) {
	Provincia = provincia;
}

public String getCiudad() {
	return Ciudad;
}

public void setCiudad(String ciudad) {
	Ciudad = ciudad;
}
 
}