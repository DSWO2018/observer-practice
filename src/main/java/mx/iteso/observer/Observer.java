/**
 * Paquete de trabajo para clases de observer.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.observer;

/**
 * Created by Palaf on 20/09/2018.
 */
public interface Observer {

     /**
      * Se ve el esdatdo.
      *
      * @return estado.
      */
     boolean scoreUpdate(String group, String massage);
}
