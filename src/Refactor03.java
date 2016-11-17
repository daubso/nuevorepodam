/*dasdasd*/
public class Refactor03 {

	private static int colPeonNegra;
	private static int filPeonNegra;
	private static int colPeonBlanca;
	private static int filPeonBlanca;
	private static int sigmovColPeonNegra;
	private static int sigmovFilPeonNegra;
	
	public static void main(String[] args) {
		//Calculamos el movimiento de un peón en un tablero de ajedrez
		//Para una partida con más peones
		//Juegan negras en la parte inferior del tablero
	
		
		//Calculamos siguiente movimieto
		if((colPeonNegra++==colPeonBlanca)&&(filPeonNegra++==filPeonBlanca)){
			//Me como blanca colocado en diagonal derecha
			movPeonDiagonalDerecha();
		}else if((colPeonNegra++==colPeonBlanca)&&(filPeonNegra--==filPeonBlanca)){
			//Este movimiento está mal
			//Me como blanca colocado en diagonal izda
			movPeonDiagonalIzq();
		}else if((colPeonNegra++!=colPeonBlanca)){
			//Muevo adelante
			MuevoAdelante();
		}
	}
	public static void movPeonDiagonalDerecha(){
		sigmovColPeonNegra=colPeonNegra++;
		sigmovColPeonNegra=filPeonNegra++;
	}
	public static void movPeonDiagonalIzq(){
		sigmovColPeonNegra=colPeonNegra++;
		sigmovColPeonNegra=filPeonNegra--;
	}
	public static void MuevoAdelante(){
		sigmovColPeonNegra=colPeonNegra++;
	}
		
}

