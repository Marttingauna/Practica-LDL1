package comedorUNNOBA;

public class Alumno extends Cliente{
    private int legajo;

    @Override
    public int valorMenu(){
        return (int) (getReserva().getMenu().getValor() * 0.60);
    }
}
