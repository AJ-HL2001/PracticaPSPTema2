package es.studium.Practica;

public class Camello

{

	String nombre;

	int posicionActual;



	Camello()

	{

		nombre = "";

		posicionActual = 0;

	}

	Camello(String n, int p)

	{

		nombre = n;

		posicionActual = p;

	}

	String getNombre()

	{

		return this.nombre;

	}

	void setNombre(String n)

	{

		nombre = n;

	}

	int getPosicionActual()

	{

		return posicionActual;

	}

	void setPosicionActual(int p)

	{

		posicionActual = p;

	}

}


