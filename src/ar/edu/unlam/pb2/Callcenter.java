package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Callcenter {

	private HashSet<Contacto> contactos;

	public Callcenter() {

		this.contactos = new HashSet<>();

	}

	public Boolean agregarContacto(Contacto nuevoContacto) {
		boolean retorno = false;
		if (!contactos.contains(nuevoContacto)) {
			contactos.add(nuevoContacto);
			retorno = true;
		}
		return retorno;
	}

	public Boolean validacionDeLlamada(Contacto contactoAgregado) {
		Boolean agregadoCorrecto = agregarContacto(contactoAgregado);
		Boolean retorno = false;
		if (agregadoCorrecto == true) {
			contactoAgregado.setEsCliente(true);
			contactoAgregado.setLlamadoNuevamente(false);
			retorno = true;
		}
		return retorno;
	}

	public Integer listaDeContactos() {
		return this.contactos.size();
	}

	public Contacto realizarLLamadaAleatoria() {
		Contacto contactoEnLinea = null;

		for (Contacto I : contactos) {
			if (I.getEsCliente() == false && I.getLlamadoNuevamente() == true) {
				I.setId(I.getId() * ((int) Math.random() * 10));
				contactoEnLinea = I;
				validacionDeLlamada(contactoEnLinea);

			}
		}
		return contactoEnLinea;
	}

}
