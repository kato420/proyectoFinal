package code;

public class Login {
  private static String usuario, password;
  static {
    usuario = "alexis";
    password = "12341";
  }

  public static String getUsuario() {
    return usuario;
  }

  public static void setUsuario(String usuario) {
    Login.usuario = usuario;
  }

  public static String getPassword() {
    return password;
  }

  public static void setPassword(String password) {
    Login.password = password;
  }

}
