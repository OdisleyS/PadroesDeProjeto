package AbstractMethod;

public class FabricaMovelVitoriano implements IAsbtractFactory{


    @Override
    public ICadeira creatCadeira() {
        return new CadeiraVitoriano();
    }

    @Override
    public IMesaDeCentro creatMesaDeCentro() {
        return new MesaDeCentroVitoriano();
    }

    @Override
    public ISofa creatSofa() {
        return new SofaVitoriano();
    }
}
