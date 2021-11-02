package comedorUNNOBA;

public class Externo extends Cliente{
    @Override
    public int valorMenu() {
        return getReserva().getMenu().getValor();
    }
}
