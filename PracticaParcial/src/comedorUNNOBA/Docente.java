package comedorUNNOBA;

public class Docente extends Cliente{
    private int numeroDeDesignacion;

    @Override
    public int valorMenu() {
        return (int) (getReserva().getMenu().getValor() * 0.80);
    }
}
