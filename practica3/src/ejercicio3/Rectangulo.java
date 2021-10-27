package ejercicio3;

public class Rectangulo extends FigurasGeometrica{
    @Override
    public void mover(int unPunto, String direccion) {
        super.getPunto().setPosicion(unPunto);

        if (direccion == "Norte"){
            super.setDir(Direccion.NORTE);
        }
        if (direccion == "Sur"){
            super.setDir(Direccion.SUR);
        }
        if (direccion == "Este"){
            super.setDir(Direccion.ESTE);
        }
        if (direccion == "Oeste"){
            super.setDir(Direccion.OESTE);
        }
    }
}
