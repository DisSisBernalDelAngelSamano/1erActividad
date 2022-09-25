package nuevoCliente;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class Principal {

    public Registro registro;

    /**
     *
     */
    public Cliente cliente;

    /**
     *
     */
    public int id;

    /**
     *
     */
    public String fecha;


    /**
     * @param reg
     */
    public void setRegistro(Registro reg) {
        // TODO implement here
        this.registro = reg;
    }

    /**
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        // TODO implement here
        this.cliente = cliente;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
      Scanner s = new Scanner(System.in);
      System.out.println("REGISTRO DE NUEVO CLIENTE");

      String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

      //Principal p = new Principal();
      Registro r =  new Registro();

      r.setFecha(timeStamp);
      System.out.println("ID de registro: ");
      int id = s.nextInt();
      r.setId(id);
      Cliente cliente = new Cliente();
      cliente.pedirDatos();

      r.setCliente(cliente);

      System.out.println(r.toString());

      //p.setRegistro(r);
    }

}
