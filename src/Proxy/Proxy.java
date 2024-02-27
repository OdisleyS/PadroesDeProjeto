package Proxy;

public class Proxy extends GerenciamentoDeArquivos {

    protected String usuario, senha;

    public Proxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }



    @Override
    public String getArquivos() {
        if (temPermissaoDeAcesso()) {
            return super.getArquivos();
        }
        return null;
    }

    @Override
    public String getLer() {
        if (temPermissaoDeAcesso()) {
            return super.getLer();
        }
        return null;
    }

    @Override
    public String getAtualizar() {
        if (temPermissaoDeAcesso()){
            return super.getAtualizar();
        }
        return  null;
    }

    @Override
    public String getExcluir() {
        if (temPermissaoDeAcesso()) {
            return super.getExcluir();
        }
        return null;
    }

    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "admin";
    }
}
