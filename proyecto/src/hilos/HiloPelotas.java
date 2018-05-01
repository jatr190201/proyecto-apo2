package hilos;

import java.util.ArrayList;

import gui.Ventana;
import modelo.Juego;
import modelo.Pelota;

public class HiloPelotas extends Thread{
	
	Ventana principal;
	ArrayList<Pelota> pelotas;

	public HiloPelotas(Ventana principal, ArrayList<Pelota> pelotas) {
		super();
		this.principal = principal;
		this.pelotas = pelotas;
	}
	
	@Override
	public void run() {
		while (principal.isJugando()) {
			for (int i = 0; i < pelotas.size(); i++) {
				pelotas.get(i).mover();
			}
			try {
				Thread.sleep(1000 / Juego.FPS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}