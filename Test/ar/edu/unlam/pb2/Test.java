package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSeCreeUnCallCenter() {
		Callcenter oesteCableColor = new Callcenter();
		assertNotNull(oesteCableColor);
	}

	@org.junit.Test
	public void queSeCreenYAgreguenContactos() {

		Boolean valorObtenido;
		Boolean valorEsperado = true;

		final String nombre_Apellido = "Faustina Escobar";
		final String celular = "+54112345678";
		final String email = "faustina2017@hotmail.com";
		final String direccion = "Entre rios 5571";
		final Boolean esCliente = false;
		final Boolean llamadoNuevamente = true;
		// E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’

		Callcenter oesteCableColor = new Callcenter();

		Contacto Faustina = new Contacto(nombre_Apellido, celular, email, direccion, esCliente, llamadoNuevamente);

		valorObtenido = oesteCableColor.agregarContacto(Faustina);

		assertEquals(valorEsperado, valorObtenido);

	}

	@org.junit.Test
	public void queYaNoSeLLameEseContacto() {

		Boolean valorObtenido;
		Boolean valorEsperado = true;

		final String nombre_Apellido = "Faustina Escobar";
		final String celular = "+54112345678";
		final String email = "faustina2017@hotmail.com";
		final String direccion = "Entre rios 5571";
		final Boolean esCliente = false;
		final Boolean llamadoNuevamente = true;
		// E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’

		Callcenter oesteCableColor = new Callcenter();

		Contacto Faustina = new Contacto(nombre_Apellido, celular, email, direccion, esCliente, llamadoNuevamente);

		oesteCableColor.agregarContacto(Faustina);

		// oesteCableColor.validacionDeLlamada(Faustina);
		valorObtenido = oesteCableColor.validacionDeLlamada(Faustina);

		assertEquals(true, valorObtenido);
	}

	@org.junit.Test
	public void queTengaArrobaYUnPuntoElEmail() {

		Boolean valorObtenido;
		Boolean valorEsperado = true;

		final String nombre_Apellido = "Faustina Escobar";
		final String celular = "+54112345678";
		final String email = "faustina2017@hotmail.com";
		final String direccion = "Entre rios 5571";
		final Boolean esCliente = false;
		final Boolean llamadoNuevamente = true;
		// E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’

		Callcenter oesteCableColor = new Callcenter();

		Contacto Faustina = new Contacto(nombre_Apellido, celular, email, direccion, esCliente, llamadoNuevamente);

		oesteCableColor.agregarContacto(Faustina);

		valorObtenido = Faustina.validacionDeEmail(email);

		// oesteCableColor.validacionDeLlamada(Faustina);
		assertEquals(true, valorObtenido);
	}

	@org.junit.Test
	public void queNoSeRepitaElContacto() {

		Integer valorEsperado = 1;

		final String nombre_Apellido = "Faustina Escobar";
		final String celular = "+54112345678";
		final String email = "faustina2017@hotmail.com";
		final String direccion = "Entre rios 5571";
		final Boolean esCliente = false;
		final Boolean llamadoNuevamente = true;
		// E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’

		Callcenter oesteCableColor = new Callcenter();

		Contacto Faustina = new Contacto(nombre_Apellido, celular, email, direccion, esCliente, llamadoNuevamente);

		oesteCableColor.agregarContacto(Faustina);
		oesteCableColor.agregarContacto(Faustina);

		// oesteCableColor.validacionDeLlamada(Faustina);
		assertEquals(valorEsperado, oesteCableColor.listaDeContactos());
	}

	@org.junit.Test
	public void realizarUnaLLamada() {

		Contacto valorEsperado = null;

		final String nombre_Apellido = "Faustina Escobar";
		final String celular = "+54112345678";
		final String email = "faustina2017@hotmail.com";
		final String direccion = "Entre rios 5571";
		final Boolean esCliente = false;
		final Boolean llamadoNuevamente = true;
		// E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’

		Callcenter oesteCableColor = new Callcenter();

		Contacto Faustina = new Contacto(nombre_Apellido, celular, email, direccion, esCliente, llamadoNuevamente);
		Contacto Faustina2 = new Contacto("ee", celular, email, direccion, esCliente, llamadoNuevamente);

		oesteCableColor.agregarContacto(Faustina);
		oesteCableColor.agregarContacto(Faustina2);

		oesteCableColor.realizarLLamadaAleatoria();

		System.out.println(oesteCableColor.realizarLLamadaAleatoria());

	}

}
