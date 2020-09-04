public class UsuarioExterno extends Usuario implements iAceptarExternos{

    String companyId;

    public UsuarioExterno(String nombre, String apellido, int telefono, String email, String companyId) {
        super(nombre, apellido, telefono, email,"Externo");
        this.companyId=companyId;

        aceptarSegunEmpresa();
    }

    public String getCompanyId() {
        return companyId;
    }


    @Override
    public void aceptarSegunEmpresa() {
        if(companyId=="Cocacola"){
            System.out.println("Empresa cualificada");
        }else{
            System.out.println("No se acepta esa empresa");
        }
    }
}
