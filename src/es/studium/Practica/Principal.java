package es.studium.Practica;

import java.util.Scanner;

public class Principal

{

	public static int distancia = 0;

	public static void main(String[] args)

	{

		Scanner teclado = new Scanner(System.in);

		int numCamellos=0;

		// Pedir el número de camellos

		do

		{

			System.out.println("Número de camellos(2-10): ");

			try

			{

				numCamellos = teclado.nextInt();

				teclado.nextLine(); // Vaciar el teclado

			}

			catch(Exception e)

			{

				System.out.println("¡Tienes que introducir un entero entre 2 y 10!");

			}

		}while((numCamellos<2)||(numCamellos>10));

		// Pedir la distancia de la carrera

		do

		{

			System.out.println("Distancia(10-50): ");

			try

			{

				distancia = teclado.nextInt();

				teclado.nextLine(); // Vaciar el teclado

			}

			catch(Exception e)

			{

				System.out.println("¡Tienes que introducir un entero entre 10 y 50!");

			}

		}while((distancia<10)||(distancia>50));

		// Mostrar mensaje de inicio de carrera

		System.out.println("Pulsar Intro para iniciar carrera...");

		teclado.nextLine();

		// Crear un hilo por cada camello e iniciar la carrera

		for(int i = 0; i < numCamellos; i++)

		{

			new Thread(new HiloCamello("Camello" + (i+1))).start();

		}

		teclado.close();

	}

}