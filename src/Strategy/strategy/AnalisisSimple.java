package Strategy.strategy;

public abstract class AnalisisSimple implements IEstrategia{
    @Override
    public void analizar() {
        iniciar();
        saltarZip();
        detener();
    }

    abstract void iniciar();
    abstract void saltarZip();
    abstract void detener();
}
