package nuevoCliente;

import java.util.*;

/**
 *
 */
public class Cliente extends Persona {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     *
     */
    private Tarjeta tarjetaDC;
    private boolean tieneT;
    //private boolean tieneTar;


    private void setTieneT(boolean v){
      this.tieneT = v;
    }
    private boolean getTieneT(){
      return this.tieneT;
    }

    /**
     * @param tarjeta
     */
    private void setTarjeta(Tarjeta tarjeta) {
        // TODO implement here
        this.tarjetaDC = tarjeta;
    }

    /**
     * @return
     */
    private String getTarjeta() {
        // TODO implement here
        return this.tarjetaDC.toString();
    }

    /**
     * @return
     */
    private String toString2() {
        // TODO implement here
        String texto=super.toString();

        if(getTieneT()){
          getTarjeta().toString();
        }

        return texto;
    }

    public void pedirDatos() {
        // TODO implement here
        boolean ver = false;
        String res = "";
        super.pedirDatos();
        Scanner s = new Scanner(System.in);
        do{
          System.out.println("Desea ingresar tarjeta: SI/NO");
          res = s.nextLine();
          if (res.equalsIgnoreCase("SI")) {
            Tarjeta tar = new Tarjeta();
            tar.pedirDatos();
            setTarjeta(tar);
            setTieneT(true);
            ver = false;
          }else if(res.equalsIgnoreCase("NO")){
            System.out.println("Bien");
            ver = false;
            setTieneT(false);
          }else{
            System.out.println("Por favor ingrese una respuesta valida");
            ver = true;
          }
        }while(ver);
        System.out.println("DATOS DEL CLIENTE INGRESADOS CORRECTAMENTE");
    }

}
