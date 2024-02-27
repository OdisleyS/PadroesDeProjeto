package AbstractMethod;

public class FabricaMovelArtDeco implements IAsbtractFactory{

    @Override
    public ICadeira creatCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public IMesaDeCentro creatMesaDeCentro() {
        return new MesaDeCentroArtDeco();
    }

    @Override
    public ISofa creatSofa() {
        return new SofaArtDeco();
    }
}
