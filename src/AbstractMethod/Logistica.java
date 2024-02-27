package AbstractMethod;

public class
Logistica {


	public void criarMovel(String modelo) {
		IAsbtractFactory criar;

		if (modelo.equalsIgnoreCase("Cadeira art deco")) {
	        criar = new FabricaMovelArtDeco();
	    } else if (modelo.equalsIgnoreCase("Cadeira moderno")) {
	        criar = new FabricaMovelModerno();
	    } else if (modelo.equalsIgnoreCase("Cadeira Vitoriano")) {
	        criar = new FabricaMovelVitoriano();
	    } else if (modelo.equalsIgnoreCase("Mesa de centro art deco")) {
			criar = new FabricaMovelArtDeco();
		} else if (modelo.equalsIgnoreCase("Mesa de centro moderno")) {
			criar = new FabricaMovelModerno();
		} else if (modelo.equalsIgnoreCase("Mesa de centro vitoriano")) {
			criar = new FabricaMovelVitoriano();
		} else if (modelo.equalsIgnoreCase("Sofa art deco")) {
			criar = new FabricaMovelArtDeco();
		} else if (modelo.equalsIgnoreCase("Sofa moderno")) {
			criar = new FabricaMovelModerno();
		} else if (modelo.equalsIgnoreCase("Sofa vitoriano")) {
			criar = new FabricaMovelVitoriano();
		} else {
	        throw new IllegalArgumentException("Modelo de movel nao disponivel");
	    }

		ICadeira cadeira = criar.creatCadeira();
		cadeira.infoCadeira();

		IMesaDeCentro mesaDeCentro = criar.creatMesaDeCentro();
		mesaDeCentro.infoMesaDeCentro();

		ISofa sofa = criar.creatSofa();
		sofa.infoSofa();
	}
	
}
