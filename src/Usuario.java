import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Usuario implements iRecibidor{

    protected String nombre;
    protected String apellido;
    protected int telefono;
    protected String email;
    protected String tipoUsuario;


    public Usuario(String nombre, String apellido, int telefono, String email, String tipoUsuario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.tipoUsuario=tipoUsuario;

        System.out.println(welcomeMessage());


    }

    @Override
    public String welcomeMessage(){
        StringBuilder bn=new StringBuilder("Bienvenido ");
        bn.append(nombre);
        bn.append(" ");
        bn.append(apellido);
        bn.append(", eres ");
        bn.append(tipoUsuario);
        return bn.toString();
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
