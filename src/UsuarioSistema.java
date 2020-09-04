import java.util.Base64;

public class UsuarioSistema extends Usuario implements iAutentificacion{

    String goldenKey;

    public UsuarioSistema(String nombre, String apellido, int telefono, String email,String goldenKey) {
        super(nombre, apellido, telefono, email,"Sistema");
        this.goldenKey=goldenKey;

        System.out.println(autenticar());

    }

    public String autenticar(){
        String cadenaCodificada= Base64.getEncoder().encodeToString(("Bearer "+goldenKey).getBytes());
        return cadenaCodificada;
    }
}
