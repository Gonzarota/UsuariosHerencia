import javax.swing.undo.CannotUndoException;
import java.util.Base64;

public class Administrador extends Usuario implements iAutentificacion{

    String goldenKey;

    public Administrador(String nombre, String apellido, int telefono, String email,String goldenKey) {
        super(nombre, apellido, telefono, email, "Admin");
        this.goldenKey=goldenKey;

        System.out.println(autenticar());

    }

    public String autenticar(){
        String cadenaCodificada= Base64.getEncoder().encodeToString(goldenKey.getBytes());
        return cadenaCodificada;
    }
}
