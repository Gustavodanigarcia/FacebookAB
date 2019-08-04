import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Tiempos {

	static Calendar now = Calendar.getInstance();		

	
	public static int diasDelMes(int mes, int año){
        switch(mes){
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10:  // Octubre
            case 12: // Diciembre
                return 31;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                return 30;
            case 2:  // Febrero
                if ( ((año%100 == 0) && (año%400 == 0)) ||
                        ((año%100 != 0) && (año%  4 == 0))   )
                    return 29;  // Año Bisiesto
                else
                    return 28;
            default:
                throw new java.lang.IllegalArgumentException(
                "El mes debe estar entre 1 y 12");
        }
          
        
}
	
	
	  public static int inicioDelMes(int Mes, boolean PrimerDia) throws ParseException {
      	
    
			int year = 2019;
			int month = Mes;
			int day = 0;
			
			
			if(PrimerDia)
			day = 1;
			else
			day = getDia();
			
			int i=0;
			
			String dateString = String.format("%d-%d-%d", year, month, day);
			java.util.Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
		
			
			String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

			
			 switch(dayOfWeek) {
			 
			 case "Monday": 
				 i=0;
				 break;
			 case "Tuesday": 
				 i=1;
				 break;
			 case "Wednesday": 
				 i=2;
				 break;
			 case "Thursday": 
				 i=3;
				 break;
			 case "Friday":  
				 i=4;
				 break;
			 case "Saturday": 
				 i=5;
				 break;
			 case "Sunday": 
				i=6;
				 break;
			 
			 }
			
			// System.out.println("En el Mes numero " + month + " el primero dia de la semana es: " + dayOfWeek + " entonces el valor numerico es: " + i);
      	return i;
      	
      }
	
	  
	  public int getMes() {
		   int numDelMes = now.get(Calendar.MONTH)+1;
		   int numDelDia = now.get(Calendar.DAY_OF_MONTH);
		  return numDelMes;

	}
	  
	  public static int getDia() {
		
		   int numDelDia = now.get(Calendar.DAY_OF_MONTH);
		  return numDelDia;

	}
	  public static int numSemana(int DiaInicial, boolean pd) {
		  int a = getDia();
		  System.out.println(a);
		  int i=0;
		  int DiasQueQuedan = 6 - DiaInicial;
		  

		  if(!pd) {
	
		for(int m = 0 ;m<a;m++) {

			  if(DiasQueQuedan > 6) {
			  i++;
			  DiasQueQuedan = 0;
			  }
			  DiasQueQuedan++;
		  
		}
	
		
		  System.out.println("cantidad de semanas: " +i);
		  return i;
		
		  
		  }else
			  return 0;
  
	  }

}
