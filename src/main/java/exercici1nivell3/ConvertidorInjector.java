package exercici1nivell3;

// Injector of the dependencies
public class ConvertidorInjector implements IConvertidorInjector{

    @Override
    public Convertidor getConvertidor() {
        return new Convertidor();
    }
}
