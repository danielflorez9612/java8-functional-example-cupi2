/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_avion
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.avion.mundo;

/**
 * Silla del avión.
 */
public class Silla
{
    // -----------------------------------------------------------------
    // Enumeraciones
    // -----------------------------------------------------------------

    /**
     * Enumeradores para las clases a las que pertenece una silla.
     */
    public enum Clase {
        /**
         * Representa la clase ejecutiva.
         */
        EJECUTIVA,

        /**
         * Representa la clase económica.
         */
        ECONOMICA
    }

    /**
     * Enumeradores para las ubicaciones de las sillas.
     */
    public enum Ubicacion {
        /**
         * Representa la ubicación ventana.
         */
        VENTANA,

        /**
         * Representa la ubicación centro.
         */
        CENTRAL,

        /**
         * Representa la ubicación pasillo.
         */
        PASILLO
    }

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Número de la silla.
     */
    private int numero;

    /**
     * Clase de la silla.
     */
    private Clase clase;

    /**
     * Ubicación de la silla.
     */
    private Ubicacion ubicacion;

    /**
     * Pasajero asignado a la silla.
     */
    private Pasajero pasajero;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la silla con su número identificador. <br>
     * <b>post: </b> El objeto silla tiene sus datos básicos número, clase y ubicación asignados. El pasajero no está asignado y tiene valor null.
     * @param pNumero Número de silla. pNumero > 0.
     * @param pClase Clase de silla. pClase pertenece {EJECUTIVA,ECONOMICA}.
     * @param pUbicacion Ubicación de la silla. pUbicacion pertenece {VENTANA, CENTRAL, PASILLO}.
     */
    public Silla( int pNumero, Clase pClase, Ubicacion pUbicacion )
    {
        numero = pNumero;
        clase = pClase;
        ubicacion = pUbicacion;
        // Inicialmente no hay ningún pasajero en la silla
        pasajero = null;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Asigna la silla al pasajero recibido como parámetro. <br>
     * <b>post: </b> La silla queda asignada al pasajero recibido como parámetro.
     * @param pPasajero Pasajero a asignar en la silla. pPasajero !=null.
     */
    public void asignarAPasajero( Pasajero pPasajero )
    {
        pasajero = pPasajero;
    }

    /**
     * Desasigna la silla al pasajero. La silla queda nuevamente libre. <br>
     * <b>post: </b> La silla queda sin pasajero asignado.
     */
    public void desasignarSilla( )
    {
        pasajero = null;
    }

    /**
     * Indica si la silla está asignada.
     * @return Retorna true si la silla esta asignada, false en caso contrario.
     */
    public boolean sillaAsignada( )
    {
        boolean asignada = true;
        if( null == pasajero )
        {
            asignada = false;
        }
        return asignada;
    }

    /**
     * Indica si la silla está asignada al pasajero recibido como parámetro.
     * @param pPasajero Pasajero a comparar con el de la silla.
     * @return Retorna true si el pasajero ocupa la silla, false si la silla está vacía o no coincide con el pasajero recibido como parámetro.
     */
    public boolean sillaAsignadaPasajero( Pasajero pPasajero )
    {
        boolean asignadaPasajero = true;
        if( null == pasajero )
        {
            asignadaPasajero = false;
        }
        else if( pasajero.igualA( pPasajero ) )
        {
            asignadaPasajero = true;
        }

        return asignadaPasajero;
    }

    /**
     * Retorna el número de la silla.
     * @return Número de la silla.
     */
    public int darNumero( )
    {
        return numero;
    }

    /**
     * Retorna la clase de la silla.
     * @return Clase de la silla.
     */
    public Clase darClase( )
    {
        return clase;
    }

    /**
     * Retorna la ubicación de la silla.
     * @return Ubicación de la silla.
     */
    public Ubicacion darUbicacion( )
    {
        return ubicacion;
    }

    /**
     * Retorna el pasajero asignado a la silla.
     * @return Pasajero asignado a la silla. Si no hay pasajero retorna null.
     */
    public Pasajero darPasajero( )
    {
        return pasajero;
    }
}