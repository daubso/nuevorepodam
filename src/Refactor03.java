
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
		colPeonNegra=1;
		filPeonNegra=3;
		colPeonBlanca=1;
		filPeonBlanca=3;
		
		//Calculamos siguiente movimieto
		if(testMoverDiagonalDerBlanco()){
			//Me como blanca colocado en diagonal derecha
			movPeonDiagonalDerecha();
		}else if(testMoverDiagonalIzqBlanco()){
			//Este movimiento está mal
			//Me como blanca colocado en diagonal izda
			movPeonDiagonalIzq();
		}else if(testMoverPeonNegroAdelante()){
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
	public static boolean testMoverDiagonalDerBlanco(){
		return ((colPeonNegra++==colPeonBlanca)&&(filPeonNegra++==filPeonBlanca))?true:false;
	}
	public static boolean testMoverDiagonalIzqBlanco(){
		return ((colPeonNegra++==colPeonBlanca)&&(filPeonNegra--==filPeonBlanca))?true:false;
	}
	public static boolean testMoverPeonNegroAdelante(){
		return (colPeonNegra++!=colPeonBlanca)?true:false;
	}
}

