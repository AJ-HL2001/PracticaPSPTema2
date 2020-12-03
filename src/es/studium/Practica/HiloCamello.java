package es.studium.Practica;

import java.util.Random;

public class HiloCamello implements Runnable

{

	Camello camello;
	int avanza;
	int recorrido = 0;
	int distanciaMeta;



	HiloCamello(String n)

	{

		camello = new Camello(n, 0);

	}



	public void run()

	{

		while(recorrido<Principal.distancia)

		{

			Random rnd = new Random();
			int porcentaje = rnd.nextInt(100);

			synchronized (this) {

				if (porcentaje < 30) {

					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					avanza = 0;
					recorrido += avanza;
					distanciaMeta = limite(distanciaMeta);
					distanciaMeta = Principal.distancia - recorrido;
					System.out.println(camello.getNombre() + " ha avanzado " + avanza + " posiciones, está a " + distanciaMeta + " posiciones de la linea de meta.");
				}

				if ((porcentaje >= 30)&&(porcentaje < 70)) {

					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					avanza = 1;
					recorrido += avanza;
					distanciaMeta = limite(distanciaMeta);
					distanciaMeta = Principal.distancia - recorrido;
					System.out.println(camello.getNombre() + " ha avanzado " + avanza + " posiciones, está a " + distanciaMeta + " posiciones de la linea de meta.");	
				}

				if ((porcentaje >=70)&&(porcentaje < 90)) {

					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					avanza = 2;
					recorrido += avanza;
					distanciaMeta = limite(distanciaMeta);
					distanciaMeta = Principal.distancia - recorrido;
					System.out.println(camello.getNombre() + " ha avanzado " + avanza + " posiciones, está a " + distanciaMeta + " posiciones de la linea de meta.");
				}

				else {

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					avanza = 3;
					recorrido += avanza;
					distanciaMeta = limite(distanciaMeta);
					distanciaMeta = Principal.distancia - recorrido;
					System.out.println(camello.getNombre() + " ha avanzado " + avanza + " posiciones, está a " + distanciaMeta + " posiciones de la linea de meta.");
				}	
			}
		}

		System.out.println(camello.getNombre() + " ha llegado a la meta.");
		System.out.println("===========================================================================");
		System.out.println("                    RESULTADO");
		System.out.println(camello.getNombre() + " ha ganado la carrera.");
		System.exit(1);

	}
	
	public int limite (int numero) {
		if (numero<0) {
			return 0;
		}
		else {
			return numero;
		}
	}
}

