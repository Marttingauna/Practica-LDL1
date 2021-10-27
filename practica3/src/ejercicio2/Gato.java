package ejercicio2;

public class Gato extends Animal {
    /*Sabe responder al metodo habla() porque su clase padre implementa la interface Hablador (no la
    implementa pero su hija si)*/
    @Override
    public void habla(){
        System.out.println("miau, miau");
    }
}
