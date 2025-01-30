package code;

public class Login {
	private static String usuario, contraseña;
	static {
		usuario = "alexis";
		contraseña = "12341";
	}

	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		Login.usuario = usuario;
	}

	public static String getContraseña() {
		return contraseña;
	}

	public static void setContraseña(String contraseña) {
		Login.contraseña = contraseña;
	}

}
