

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;



public class AutoClick {
	
	public static void leftClick(Robot robot) {
			
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
public static void doubleleftClick(Robot robot)
{
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

public static void Tabu(Robot robot) {
	
	
	robot.delay(200);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.delay(200);
	
	
}

public static void TabuEX(Robot robot) {
	
	
	robot.delay(200);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.delay(200);
	robot.delay(100);
	AutoClick.Subir(robot, 1);
	robot.delay(100);
	
	
}






public static void Enter(Robot robot) {
	
	
	robot.delay(200);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.delay(200);
	
	
}


public static void C50(Robot robot) {
	robot.delay(200);
	robot.keyPress(KeyEvent.VK_5);
	robot.keyRelease(KeyEvent.VK_5);	
	robot.delay(200);
	robot.keyPress(KeyEvent.VK_0);
	robot.keyRelease(KeyEvent.VK_0);
	robot.delay(200);
	
	
	
}


public static void DondeEstoy(Robot robot) {
	
	for(int i = 0; i<200; i++) {
	robot.mouseMove(500, 500);
	robot.mouseMove(550, 500);
	}
	
	
}

public static void Bajar(Robot robot, int it) {
	
	for (int i=0; i<it; i++) {
	robot.delay(10);
	AutoClick.leftClick(robot);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);	
	
	}
	
}


public static void Subir(Robot robot, int it) {
	
	for (int i=0; i<it; i++) {
	robot.delay(10);
	robot.keyPress(KeyEvent.VK_UP);
	robot.keyRelease(KeyEvent.VK_UP);	
	
	}
	
}

public static void Derecha(Robot robot, int it) {
	
	for (int i=0; i<it; i++) {
	robot.delay(10);
	robot.keyPress(KeyEvent.VK_RIGHT);
	robot.keyRelease(KeyEvent.VK_RIGHT);	
	
	}
	
}

public static void Izquierda(Robot robot, int it) {
	
	for (int i=0; i<it; i++) {
	robot.delay(10);
	robot.keyPress(KeyEvent.VK_LEFT);
	robot.keyRelease(KeyEvent.VK_LEFT);	
	
	}
	
}






public static void BuscarProducto(Robot robot) {
	
	robot.keyPress(17);
	robot.keyPress(70);
	robot.delay(100);
	robot.keyRelease(17);
	robot.keyRelease(70);
	
}	


public static void Copiar(Robot robot) {
	
	robot.keyPress(17);
	robot.keyPress(67);
	robot.delay(100);
	robot.keyRelease(17);
	robot.keyRelease(67);
	
}	

public static void Pegar(Robot robot) {
	
	robot.keyPress(17);
	robot.keyPress(86);
	robot.delay(100);
	robot.keyRelease(17);
	robot.keyRelease(86);
	
}	



public static void CambiarPantalla(Robot robot) {
	
	
	robot.keyPress(18);
	robot.delay(100);
	robot.keyPress(9);
	robot.keyRelease(9);	
	robot.delay(100);
	robot.keyRelease(18);
}



public static void CambiarPantallaX2(Robot robot) {
	
	
	robot.keyPress(18);
	robot.delay(100);
	robot.keyPress(9);
	robot.keyRelease(9);
	robot.delay(100);
	robot.keyPress(9);
	robot.keyRelease(9);
	robot.delay(100);
	robot.keyRelease(18);
}
public static void AbrirNavegador(Robot robot) {
	
	
	robot.keyPress(17);
	robot.delay(100);
	robot.keyPress(78);
	robot.keyRelease(78);
	robot.delay(100);
	robot.keyRelease(17);
}




















































public static void Letra (Robot robot, String Letra, int tmp) {
	
	
	if(Letra.equalsIgnoreCase("A"))
		 {	
		robot.delay(tmp);
		robot.keyPress(65);
		robot.keyRelease(65);	
		robot.delay(tmp);
		}
	if(Letra.equalsIgnoreCase("B"))
	 {	
		robot.delay(tmp);
	robot.keyPress(66);
	robot.keyRelease(66);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("C"))
	 {	
		robot.delay(tmp);
	robot.keyPress(67);
	robot.keyRelease(67);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("D"))
	 {	
		robot.delay(tmp);
	robot.keyPress(68);
	robot.keyRelease(68);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("E"))
	 {	
		robot.delay(tmp);
	robot.keyPress(69);
	robot.keyRelease(69);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("F"))
	 {	
		robot.delay(tmp);
	robot.keyPress(70);
	robot.keyRelease(70);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("G"))
	 {	
		robot.delay(tmp);
	robot.keyPress(71);
	robot.keyRelease(71);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("H"))
	 {	
		robot.delay(tmp);
	robot.keyPress(72);
	robot.keyRelease(72);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("I"))
	 {	
		robot.delay(tmp);
	robot.keyPress(73);
	robot.keyRelease(73);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("J"))
	 {	
		robot.delay(tmp);
	robot.keyPress(74);
	robot.keyRelease(74);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("K"))
	 {	
		robot.delay(tmp);
	robot.keyPress(75);
	robot.keyRelease(75);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("L"))
	 {	
		robot.delay(tmp);
	robot.keyPress(76);
	robot.keyRelease(76);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("M"))
	 {	
		robot.delay(tmp);
	robot.keyPress(77);
	robot.keyRelease(77);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("N"))
	 {	
		robot.delay(tmp);
	robot.keyPress(78);
	robot.keyRelease(78);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("O"))
	 {	
		robot.delay(tmp);
	robot.keyPress(79);
	robot.keyRelease(79);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("P"))
	 {	
		robot.delay(tmp);
	robot.keyPress(80);
	robot.keyRelease(80);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("Q"))
	 {	
		robot.delay(tmp);
	robot.keyPress(81);
	robot.keyRelease(81);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("R"))
	 {	
		robot.delay(tmp);
	robot.keyPress(82);
	robot.keyRelease(82);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("S"))
	 {	
		robot.delay(tmp);
	robot.keyPress(83);
	robot.keyRelease(83);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("T"))
	 {	
		robot.delay(tmp);
	robot.keyPress(84);
	robot.keyRelease(84);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("U"))
	 {	
		robot.delay(tmp);
	robot.keyPress(85);
	robot.keyRelease(85);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("V"))
	 {	
		robot.delay(tmp);
	robot.keyPress(86);
	robot.keyRelease(86);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("W"))
	 {	
		robot.delay(tmp);
	robot.keyPress(87);
	robot.keyRelease(87);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("X"))
	 {	
		robot.delay(tmp);
	robot.keyPress(88);
	robot.keyRelease(88);	
	robot.delay(tmp);
	}
	if(Letra.equalsIgnoreCase("Y"))
	 {	
		robot.delay(tmp);
	robot.keyPress(89);
	robot.keyRelease(89);	
	robot.delay(tmp);
	}
	
	if(Letra.equalsIgnoreCase("Z"))
	 {	
		robot.delay(tmp);
	robot.keyPress(90);
	robot.keyRelease(90);	
	robot.delay(tmp);
	}

 }
	
	
}
