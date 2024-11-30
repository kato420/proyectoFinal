package metodos;
import java.lang.reflect.Field;

public class Utils {
	
	//------------------------------------- VARIABLES GLOBALES ------------------------------------//
	// Datos mínimos de la primera cocina
	public static String modelo1 = "Mabe EMP6120PG0";
	public static double precio1 = 949.0;
	public static double fondo1 = 58.6;
	public static double ancho1 = 60.0;
	public static double alto1 = 91.0;
	public static int quemadores1 = 4;
	public static int stock1 = 100;
	// Datos mínimos de la segunda cocina
	public static String modelo2 = "Indurama Parma";
	public static double precio2 = 1089.0;
	public static double ancho2 = 80.0;
	public static double alto2 = 94.0;
	public static double fondo2 = 67.5;
	public static int quemadores2 = 6;
	public static int stock2 = 100;
	// Datos mínimos de la tercera cocina
	public static String modelo3 = "Sole COSOL027";
	public static double precio3 = 850.0;
	public static double ancho3 = 60.0;
	public static double alto3 = 90.0;
	public static double fondo3 = 50.0;
	public static int quemadores3 = 4;
	public static int stock3 = 100;
	// Datos mínimos de la cuarta cocina
	public static String modelo4 = "Coldex CX602";
	public static double precio4 = 629.0;
	public static double ancho4 = 61.6;
	public static double alto4 = 95.0;
	public static double fondo4 = 51.5;
	public static int quemadores4 = 5;
	public static int stock4 = 100;
	// Datos mínimos de la quinta cocina
	public static String modelo5 = "Reco Dakota";
	public static double precio5 = 849.0;
	public static double ancho5 = 75.4;
	public static double alto5 = 94.5;
	public static double fondo5 = 66.0;
	public static int quemadores5 = 5;
	public static int stock5 = 100;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	
	
	
	//------------------------------------- MÉTODOS IMPORTANTES ------------------------------------//
	//método de prueba
	public static String saludar(String name) {
		return "Hola " + name + ". Modelo: " + modelo1;
	}
	//método para obtener las variables con los indices
	 public static String obtenerPropiedadDinamica(String nombreBase, int i) {
		    String propiedad = nombreBase + i;
		    try {
		        // Obtener el campo dinámicamente
		        Field campo = Utils.class.getDeclaredField(propiedad);
		        // Acceder al valor de la variable (debe ser static)
		        Object valor = campo.get(null); // null porque el campo es estático

		        // Convertir a String y retornar
		        return String.valueOf(valor);
		    } catch (NoSuchFieldException | IllegalAccessException e) {
		        // Manejar excepciones si el campo no existe o no se puede acceder
		        e.printStackTrace();
		        return "Error: No se pudo acceder a la propiedad " + propiedad;
		    }
	}
}
