package main;

import java.util.concurrent.Semaphore;

import controller.Threadcozinha;

public class Principal {

	public static void main(String[] args) {
		int permissoes=1;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int idprato = 0; idprato < 5; idprato++) {
			Thread tCozinha = new Threadcozinha(idprato,semaforo);
			tCozinha.start();
		}
		
	}

}
