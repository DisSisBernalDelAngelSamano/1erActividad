package nuevoCliente;

import java.util.*;

/**
 *
 */
public class Tarjeta {

    /**
     * Default constructor
     */
    public Tarjeta() {
    }

    /**
     *
     */
    private int numero;

    /**
     *
     */
    private String banco;

    /**
     *
     */
    private String tipo;

    /**
     *
     */
    private String fechaC;



    /**
     * @param num
     */
    private void setNumero(int num) {
        // TODO implement here
        this.numero = num;
    }

    /**
     * @return
     */
    private String getNumero() {
        // TODO implement here
        return ""+this.numero;
    }

    /**
     * @param banco
     */
    private void setBanco(String banco) {
        // TODO implement here
        this.banco = banco;
    }

    /**
     * @return
     */
    private String getBanco() {
        // TODO implement here
        return this.banco;
    }

    /**
     * @param tipo
     */
    private void setTipo(String tipo) {
        // TODO implement here
        this.tipo = tipo;
    }

    /**
     * @return
     */
    private String getTipo() {
        // TODO implement here
        return this.tipo;
    }

    /**
     * @param fecha
     */
    private void setFechaC(String fecha) {
        // TODO implement here
        this.fechaC = fecha;
    }

    /**
     * @return
     */
    private String getFecha() {
        // TODO implement here
        return this.fechaC;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        String texto="";
        texto+= "\nNumero: " + getNumero();
        texto+= "\nBanco: " + getBanco();
        texto+= "\nTipo: " + getTipo();
        texto+= "\nFecha de vencimiento: " + getFecha();
        return texto;
    }
    public void pedirDatos() {
        // TODO implement here
        Scanner s = new Scanner(System.in);
        boolean ver = false;
        String tipo;
        System.out.println("Ingrese el Banco de la tarjeta");
        setBanco(s.nextLine());
        System.out.println("Ingrese el numero de su tarjeta: ");
        setNumero(s.nextInt());

        do{
          System.out.println("Ingrese tipo : Matercard/visa");
          tipo = s.nextLine();
          if(tipo.equalsIgnoreCase("Mastercard") || tipo.equalsIgnoreCase("visa")){
            setTipo(tipo);
            ver = false;
          }else{
            System.out.println("Ingrese una opcion correcta");
            ver = true;
          }
        }while(ver);
        System.out.println("Ingrese la fecha de vencimiento de la tarjeta:");
        setFechaC(s.nextLine());
    }
}
