package AbstractMethod;

public class FabricaMovelModerno implements IAsbtractFactory{

    @Override
    public ICadeira creatCadeira() {
        return new CadeiraModerno();
    }

    @Override
    public IMesaDeCentro creatMesaDeCentro() {
        return new MesaDeCentroModerno();
    }

    @Override
    public ISofa creatSofa() {
        return new SofaModerno();
    }
}
