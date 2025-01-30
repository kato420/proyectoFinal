package code;

public class Menu {
	private static int tituloVentana;
	static {
		tituloVentana = 0;
	}

	public static int getTituloVentana() {
		return tituloVentana;
	}

	public static void setTituloVentana(int tituloVentana) {
		Menu.tituloVentana = tituloVentana;
	}
}
