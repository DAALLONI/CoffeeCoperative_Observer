import java.util.ArrayList;
import java.util.List;

public class CooperativaCafe implements Subject {

    private List<Observer> baristas;

    public CooperativaCafe() {
        baristas = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {

        if (!baristas.contains(observer)) {
            baristas.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {

        baristas.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : baristas) {
            observer.update(loteActual);
        }
    }

    private MicroLote loteActual;

    public void registrarLote(MicroLote lote) {

        loteActual = lote;

        notifyObservers();
    }
}