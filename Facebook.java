import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

import javaRobot.AutoClick;

public class Facebook {

	public static void main(String[] args) throws ParseException, HeadlessException, UnsupportedFlavorException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		Facebook face = new Facebook();
		face.verHora();	
	}

	private Robot robot;
	public Keyboard keyboard;
	private static int[] x = {760,790,822,858,888,920,950}; 
	Tiempos tiempo = new Tiempos();
	File folder = new File("C:\\Users\\gustavo\\Desktop\\facebook");
	File[] lista = folder.listFiles();	
	
	public void verHora() throws ParseException, HeadlessException, UnsupportedFlavorException, IOException, AWTException{
		
		try {	
			robot = new Robot();
		} catch (AWTException e) {	
			e.printStackTrace();	
		}

		int numDelMes= tiempo.getMes();
		int[] x = {760,790,822,858,888,920,950}; 
		int[] y = {630,656,682,708,734,755};
		Random rd = new Random();
		int numDelDiaActual;
		boolean pd = false;
		int r;
		for(int m=0;m<(13-numDelMes);m++) {//mes
			
			
			int cantidadDiasMes = Tiempos.diasDelMes(numDelMes+m,2019);
			
			if(m==0)
			numDelDiaActual = tiempo.getDia() - 1;
			else
				numDelDiaActual = 0;
			
			robot.delay(1500);
			robot.delay(600);
			
			if(pd) {
			robot.delay(600);
			robot.mouseMove(950,570);
			robot.delay(600);
			AutoClick.leftClick(robot);
			}
			
			

			int inicioX = tiempo.inicioDelMes(numDelMes+m,pd);
			int yenY = tiempo.numSemana(inicioX,pd);
			
			pd = true;
		
			for(int j=0;j<(cantidadDiasMes-numDelDiaActual);j++) {//dia
		
					r = rd.nextInt(lista.length+1);
				
				publicarFace(r); //PUBLICAR
				robot.mouseMove(825, 540); //CALENDARIO
				robot.delay(1000);
				AutoClick.leftClick(robot);
				robot.delay(1000);
				
				robot.mouseMove(x[inicioX], y[yenY]); //MOVER EN EL CALENDARIO
				robot.delay(800);
				robot.delay(800);
				AutoClick.leftClick(robot);
				robot.delay(800);
				robot.delay(800);
				
				
				
				robot.delay(1000);  //CONFIRMAR PUBLICACION
				robot.delay(1000);
				robot.mouseMove(1120, 720);
				robot.delay(600);
				AutoClick.leftClick(robot);
				
				
				robot.delay(100);
			
				inicioX++;
				
				if(inicioX>6) {		
					inicioX = 0;
					yenY++;
							}
							
				robot.delay(1500);
				robot.delay(1500);
				robot.delay(1500);
				robot.delay(1500);
				
			
										} //FIN DEL CICLO DEL DIA ( J ) PRINCIPAL
			
										} //FIN DEL MES (I)
				
										} //FIN DE LA FUNCION
			
	
	public void publicarFace(int x) throws HeadlessException, UnsupportedFlavorException, IOException, AWTException {
		
		try {	
			robot = new Robot();
		} catch (AWTException e) {	
			e.printStackTrace();	
		}
		
		keyboard = new Keyboard();
		
		
		/////////////CREAR PUBLICACION
		robot.delay(2000);
		robot.delay(800);
		robot.delay(800);
		
		robot.mouseMove(1400, 270); //Crear Publicacion
		AutoClick.leftClick(robot);
		
		
		robot.delay(1000);
		robot.delay(1000);
		robot.delay(1000);
		robot.delay(1000);
	
		
		//MUCHA CARGA DE PAGINA
		
		
		robot.delay(700);
		
		AutoClick.SeleccionarPalabra(robot, 1000, 300, -60,0);
		
		robot.delay(800);
		
		AutoClick.Copiar(robot);
		
		String data = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); 
		
		if(!data.equalsIgnoreCase("Empleo"))
			throw new HeadlessException();  //SE PUEDE EJECUTAR DE NUEVO
		

		robot.mouseMove(760, 410);
		robot.delay(800);
		robot.delay(800);
		AutoClick.leftClick(robot);
		
		
		

		
		//*****ELEGIR IMAGEN
		robot.delay(800);
		robot.delay(800);
		robot.mouseMove(790, 350);
		robot.delay(800);
		robot.delay(800);
		AutoClick.leftClick(robot);
		robot.delay(1000);
		keyboard.type(x + ".png");
		robot.delay(900);
		AutoClick.Enter(robot);
		robot.delay(1000);
		robot.delay(800);
		
		
		
		robot.mouseMove(790, 350); 
		robot.delay(800);
		AutoClick.leftClick(robot);//caja de comentario 
		

         //DESCRIPCION FIJA DE PRODUCTO//////////////////////////////
		
		robot.mouseMove(350, 10);
		robot.delay(600);
		AutoClick.leftClick(robot);
		robot.delay(600);
		robot.mouseMove(150, 600);
		robot.delay(600);
		AutoClick.leftClick(robot);
		robot.delay(600);
		AutoClick.Bajar(robot, 1);
		robot.delay(900);
		

		if(x>0 && x<40) {
		AutoClick.SeleccionarPalabra(robot, 720, 870, -55, -70);
		robot.delay(900);
		AutoClick.Copiar(robot);
		}
		
		
		if(x>40 && x<70) {
			AutoClick.SeleccionarPalabra(robot, 660, 880,60, 70);
			robot.delay(900);
			AutoClick.Copiar(robot);
			}
			
			if(x>70 && x<lista.length) {
			AutoClick.SeleccionarPalabra(robot, 660, 970,60, 50);
			robot.delay(900);
			AutoClick.Copiar(robot);
			}
			
			robot.delay(900);
			robot.mouseMove(150, 600);
			robot.delay(600);
			AutoClick.leftClick(robot);
			robot.delay(600);
			AutoClick.Subir(robot, 1);
		
			
			robot.delay(900);
			robot.mouseMove(100, 10);
			robot.delay(600);
			AutoClick.leftClick(robot);
			robot.delay(800);
			robot.delay(1500);
			AutoClick.Pegar(robot);
		
			
		robot.delay(1000);
		robot.mouseMove(772, 350);
		robot.delay(800);
		AutoClick.leftClick(robot);
		robot.delay(1500);
		robot.delay(900);
		descripcionPublicacion(x);
		robot.delay(1500);
		robot.delay(600);
		AutoClick.Enter(robot);
		robot.delay(900);
		AutoClick.Enter(robot);
		robot.delay(600);
		robot.delay(600);
		robot.delay(1000);
		
		
		
		robot.mouseMove(950, 700);
		robot.delay(1000);
		robot.delay(1000);
		AutoClick.leftClick(robot);//CONFIRMAR PUBLICACION
		robot.delay(1500);
		
		
		robot.mouseMove(855,540); //HORARIO
		robot.delay(900);
		AutoClick.leftClick(robot);
		robot.delay(800);
		keyboard.type("19");

		/////CALENDARIO

		
		//////confirmar publicacion DEFINITIVAMENTE
	
	}
	
	//CONFIRMAR FECHA: robot.mouseMove(1120, 720);

	public void descripcionPublicacion(int x) throws IOException {         //FRASES PUBLICACION

	
						//REMERA MODAL n DEL 0 AL 4
	String[] frases = {"Remera de tela modal, Precio y link por mensaje privado no te quedes sin la tuya, stock LIMITADO. Envios a todo el pais y Cuotas Sin Interes.",
						"Estadios miticos, jugadores leyenda, equipos historicos en Remeras de modal, No te quedes sin la tuya, stock LIMITADO."
						+ " Envios a todo el pais y Cuotas Sin Interes.",
						"Recuperamos el stock de uno nuestros productos mas vendidos No te quedes sin la tuya, stock LIMITADO .Envios a todo el pais y Cuotas Sin Interes.",
						"Estadios miticos, jugadores leyenda, equipos historicos en Remeras de hombre y mujer en algodon y modal respectivamente tambien buzos y buzos hoodies",
						"Que tu remera no sea una mas.Remera en tela modal precio popular, no te quedes sin la tuya, stock LIMITADO. Envios a todo el pais y Cuotas Sin Interes.",
						
						
						//REMERA ALGODON n DEL 5 AL 8
						"Que tu remera no sea una mas.Remera en tela algodon peinado, no te quedes sin la tuya, stock LIMITADO. Envios a todo el pais y Cuotas Sin Interes.",
						"Una forma sencilla de demostrar identidad. Envios a todo el pais y Cuotas Sin Interes",
						"Estadios miticos jugadores leyenda, equipos historicos en Remeras de hombre y mujer en algodon y modal respectivamente tambien buzos y buzos hoodies",
						"llevemos futbol a todas partes Remera en algodon peinado. stock LIMITADO. Envios a todo el pais y Cuotas Sin Interes. ",
						
						
						//BUZO HOODIE o buzo simple n DEL 9 AL 11
						"Si compras 3 unidades de Buzo hoodie o buzos simple ENVIO GRATIS Por tiempo limitado hasta la semana que viene",
						"Aprovecha de esta oferta comprando 3 unidades de buzos hoodies o buzo simple tenes el Envio Gratis",
						"Pensamos en un Buzo que te acerque todos los dias con tu pasion",
						
						//Remera Mujer n 12
						"Remeras de modal de mujer en talle del S al XXL stock LIMITADO .Envios a todo el pais y Cuotas Sin Interes",
																																	};
				
	

	BufferedImage bimg = ImageIO.read(lista[x]); //Filtro de publicacion dependiendo la img
	int xx          = bimg.getWidth(); //Tamaño de ancho
	int yy         = bimg.getHeight();  //Tamaño de ancho 
	int num_frase_modal = ThreadLocalRandom.current().nextInt(0, 5);
	int num_frase_algodon = ThreadLocalRandom.current().nextInt(5,9);
	int num_frase_buzo = ThreadLocalRandom.current().nextInt(9,12);

	System.out.println("prod" + lista[x].getName());
	if(xx == 800 && yy == 800 &&  lista[x].length()>700000)
		keyboard.type(frases[num_frase_modal]);
	
	
	if(xx == 800 && yy == 800 &&  lista[x].length()<700000)
		keyboard.type(frases[12]);
	
	
	if(xx == 1000 && yy == 1000 || xx == 1600 && yy== 1600)
	keyboard.type(frases[num_frase_buzo]);
	
	if(xx == 1716 && yy == 1742)
		keyboard.type(frases[num_frase_algodon]); 
	
	if(xx == 1608 && yy == 1748)
		keyboard.type(frases[num_frase_algodon]); 

	}
	
	public static boolean isBetween(int x, int lower, int upper) {
		  return lower <= x && x <= upper;
		}
	
	public void arrayy() {
		
		try {	
			robot = new Robot();
		} catch (AWTException e) {	
			e.printStackTrace();	
		}
		robot.mouseMove(950, 700);
	}
	

}
