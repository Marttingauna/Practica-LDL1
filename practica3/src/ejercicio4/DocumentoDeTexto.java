package ejercicio4;

public class DocumentoDeTexto implements Documento {
    private String cuerpo;
    /*CONSTRUCTOR: inicializa la clase "DocumentoDeTexto"*/
    public DocumentoDeTexto(String cuerpo){
        this.cuerpo=cuerpo;
    }
    /*OVERRIDE: Sobreescribe el metodo imprimir*/
    @Override
    public void imprimir() {
        /*Como esta clase implementa la interfaz Documento, es necesario definir el comportamiento del método imprimir().
        En este caso, simplemente realiza un sout sobre si mismo, lo que dispara el método toString() y lo imprime por pantalla
         */
        System.out.println(this);
    }

    @Override
    /*CUANDO SE LLAMA A SI MISMO lo que dispara el método toString() y lo imprime por pantalla*/
    public String toString() {
        return "DocumentoDeTexto{" +
                "cuerpo='" + cuerpo + '\'' +
                '}';
    }
}
