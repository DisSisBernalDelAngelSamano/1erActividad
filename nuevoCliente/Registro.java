package nuevoCliente;

import java.util.*;


/**
 *
 */
public class Registro {

    /**
     * Default constructor
     */
    public Registro() {
    }

    /**
     *
     */
    public int id;

    /**
     *
     */
    public Cliente cliente;

    /**
     *
     */
    public String fecha;



    /**
     * @param id
     */
    public void setId(int id) {
        // TODO implement here
        this.id = id;
    }

    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return this.id;
    }

    /**
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        // TODO implement here
        this.cliente = cliente;
    }

    /**
     * @return
     */
    public Cliente getCliente() {
        // TODO implement here
        return this.cliente;
    }

    /**
     * @param fecha
     */
    public void setFecha(String fecha) {
        // TODO implement here
        this.fecha = fecha;
    }

    /**
     * @return
     */
    public String getFecha() {
        // TODO implement here
        return this.fecha;
    }

    public String toString(){
      //System.out.println("TO String");
      String texto = "\nREGISTRO EXITOSO: ";
      texto += "\nID: " + getId();
      texto += "\nFecha: " +getFecha();
      texto += "\n\tCLIENTE: \n" + getCliente().toString();

      return texto;
    }

}
