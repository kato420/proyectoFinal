package code;

public class Menu {
	private static int opcion;
	private static int contadorRegistros;
	static {
		opcion = 0;
		contadorRegistros = 0;
	}

	public static int getOpcion() {
		return opcion;
	}

	public static void setOpcion(int opcion) {
		Menu.opcion = opcion;
	}

	public static int getContadorRegistros() {
		return contadorRegistros;
	}

	public static void setContadorRegistros(int contadorRegistros) {
		Menu.contadorRegistros = contadorRegistros;
	}

}
