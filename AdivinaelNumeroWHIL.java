import java.util.Scanner;

public class AdivinaelNumeroWHIL {

	public static void main(String[] args) {
		
		        
		        boolean VolveraJugar = true;
		        int number = -1;
				int valor1;
				int i = 1 ;
				String respuesta;
				
				valor1 = (int)Math.floor(Math.random() * 100)+ 1;
			
				
					Scanner scanner = new Scanner (System.in);
					
			
			while (VolveraJugar == true) {
				System.out.println("DIME UN NUMERO DEL 1 AL 100");
				
				
				for (i = 1;number != valor1 ; i++)	{

				
				
				 number = scanner.nextInt();
				
				
				
				if(number>100)
					System.out.println("NÚMERO NO VALIDO,PRUEBE OTRA VEZ");
				else
					if(number<=0)
						System.out.println("NÚMERO NO VALIDO,PRUEBE OTRA VEZ  ");
			
					
			
				if ( number < valor1 && number >0)
						System.out.println("TE HAS QUEDADO CORTO,INTENTALO OTRA VEZ");
					else 
						if( number > valor1 && number<100)
							System.out.println("TE HAS PASADO 5 PUEBLOS ,INTENTALO OTRA VEZ");
						else
							
							
				if ( number == valor1) 
					System.out.println("HAS ACERTADO,FELICIDADES, LO ACERTASTE EN  " + i + " INTENTOS " );
				
				
			}
				System.out.println("¿SI QUIERES VOLVER A JUGAR? PON si, SI ES NO PON no");
			
				
				    respuesta = scanner.next().toLowerCase();

	                if(respuesta.equals("no")) {
	                	VolveraJugar = false;
	                	System.out.println("JUEGO TERMINADO");
	                }
				
				 
				 
				    if (respuesta.equals ("si")) {
				    	valor1 = (int)Math.floor(Math.random() * 100)+ 1;
				    	i = 0;
				    	VolveraJugar = true;
				    }
				
			
                
				
			
			
			}
			
			
			
			}
		




	}


