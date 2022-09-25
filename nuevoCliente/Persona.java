package nuevoCliente;
import java.util.*;

/**
 *
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     *
     */
    private int id;

    /**
     *
     */
    private String nombre;

    /**
     *
     */
    private String apellidoP;

    /**
     *
     */
    private String apellidoM;

    /**
     *
     */
    private String correo;

    /**
     *
     */
    private String telefono;

    /**
     *
     */
    private String domicilio;

    /**
     * @param id
     */
    private void setId(int id) {
        // TODO implement here
        this.id = id;
    }

    /**
     * @return
     */
    private int getId() {
        // TODO implement here
        return id;
    }

    /**
     * @param nombre
     */
    private void setNombre(String nombre) {
        // TODO implement here
        this.nombre = nombre;
    }

    /**
     * @return
     */
    private String getNombre() {
        // TODO implement here
        return this.nombre;
    }

    /**
     * @param aP
     */
    private void setApellidoP(String aP) {
        this.apellidoP = aP;
    }

    /**
     * @return
     */
    private String getApellidoP() {
        // TODO implement here
        return this.apellidoP;
    }

    /**
     * @param aM
     */
    private void setApellidoM(String aM) {
        // TODO implement here
        this.apellidoM = aM;
    }

    /**
     * @return
     */
    private String getApellidoM() {
        // TODO implement here
        return this.apellidoM;
    }

    /**
     * @param corr
     */
    private void setCorreo(String corr) {
        // TODO implement here
        this.correo = corr;
    }

    /**
     * @return
     */
    private String getCorreo() {
        // TODO implement here
        return this.correo;
    }

    /**
     * @param tel
     */
    private void setTelefono(String tel) {
        // TODO implement here
        this.telefono = tel;
    }

    /**
     * @return
     */
    private String getTelefono() {
        // TODO implement here
        return ""+this.telefono;
    }

    /**
     * @param dom
     */
    private void setDomicilio(String dom) {
        // TODO implement here
        this.domicilio = dom;
    }

    /**
     * @return
     */
    private String getDomicilio() {
        // TODO implement here
        return this.domicilio;
    }

    /**
     *
     */
    public void pedirDatos() {
        // TODO implement here
        Scanner s = new Scanner(System.in);

        System.out.println("INGRESE LOS SIGUIENTES DATOS");
        System.out.print("Nombre: ");
        setNombre(s.nextLine());
        System.out.print("Apellido Paterno: ");
        setApellidoP(s.nextLine());
        System.out.print("Apellido Materno: ");
        setApellidoM(s.nextLine());
        System.out.print("Correo: ");
        setCorreo(s.nextLine());
        System.out.print("Telefono: ");
        setTelefono(s.nextLine());
        System.out.print("Domicilio: ");
        setDomicilio(s.nextLine());

    }

    public String toString(){
      String texto = "";
      texto += "\nNombre: "+ getNombre();
      texto += "\nApellido Paterno: "+getApellidoP();
      texto += "\nApellido Materno: "+getApellidoM();
      texto += "\nCorreo: "+getCorreo();
      texto += "\nTelefono: "+getTelefono();
      texto += "\nDomicilio: "+getDomicilio();
      return texto;
    }

}
