package Proxy;

public class GerenciamentoDeArquivos {

    private String arquivos;
    private String ler;
    private String atualizar;
    private String excluir;

    public GerenciamentoDeArquivos() {
        this.arquivos = "Criar arquivos";
        this.ler = "Lendo Arquivos ";
        this.atualizar = "Atualizando arquivos";
        this.excluir = "Excluindo arquivos";
    }

    public String getArquivos() {
        return new String(arquivos);
    }

    public String getLer() {
        return new String(ler);
    }

    public String getAtualizar() {
        return new String(atualizar);
    }

    public String getExcluir() {
        return new String(excluir);
    }
}
