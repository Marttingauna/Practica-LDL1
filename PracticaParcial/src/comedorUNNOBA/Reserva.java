package comedorUNNOBA;

import comedorUNNOBA.exceptions.MaximoMenuException;
import comedorUNNOBA.exceptions.ReservaConfirmadaException;

import java.util.Date;
import java.util.Vector;

public class Reserva {
    private Date fecha;
    private Cliente cliente;
    private int maxMenu;
    private static Vector<Menu> menus = new Vector();
    private boolean confirmación;
    private Menu menu;

    public Reserva(int maximo){
        this.maxMenu=maximo;
        this.confirmación=false;

    }

    public boolean isConfirmación() {
        return confirmación;
    }

    public static void setMenus(Vector<Menu> menus) {
        Reserva.menus = menus;
    }

    /* a)
    Crea una nueva reserva */
    public double nuevaReserva(Cliente cliente, Vector<Menu> menus){
        this.cliente= cliente;
        this.menus= menus;
        this.fecha= new Date();
        this.maxMenu= 3;
        this.confirmación= false;
        return 0;
    }

    /* b)
    * *Confirma la reserva pasada por parámetro */
    public void confirmarReserva(Reserva reserva){
        reserva.confirmación= true;
    }

    /* c)
     * Retorna el valor de la reserva pasada por parámetro*/
    public double valorDe(Reserva reserva){
        return reserva.menu.getValor();
    }

    /* d)
     * De ser posible, agrega un menú a una reserva*/
    public void agregarMenu(Menu menu) throws ReservaConfirmadaException, MaximoMenuException {
        int capacidadMenu= 	this.menus.capacity();
        int cantidadElementosMenu= menus.size();

        if(this.confirmación==true){/*Si la reserva esta confirmada arrojo excepción*/
            throw new ReservaConfirmadaException();
        }
        /*Si la cantidad de elementos en el Vector menus es menor a el maximo.(SI AUN QUEDAN ESPACIOS)
        * Agrega elementos al Vector menús */
        if(menus.size()<maxMenu){
            menus.add(menu);
        }else{/*Si no (El menu está completo) arroja excepción*/
            throw new MaximoMenuException();
        }
        System.out.println("Se agregó el menu correctamente a la reserva.");

    }
    public void agregarMenu1(Menu menu) throws MaximoMenuException, ReservaConfirmadaException {
        /* Si la confirmacion no esta confirmada(false)  */
        if(!confirmación){
            if(menus.size()<maxMenu){
                menus.add(menu);
            }else{
                throw new MaximoMenuException();
            }
        }else{
            throw new ReservaConfirmadaException();
        }
    }

    public void quitarMenu(Menu menu)throws ReservaConfirmadaException{
        if(this.confirmación==true){
            throw new ReservaConfirmadaException();
        }else{
            /*Elimina el elemento en la posición especificada en este vector.
            menus.remove(1);
            */
            menus.remove(menu);/* Busca y elimina. Elimina la primera aparición del elemento especificado en este vector.
             Si el vector no contiene el elemento, no se modifica.*/
        }
    }



    public Menu getMenu() {
        return menu;
    }
}
