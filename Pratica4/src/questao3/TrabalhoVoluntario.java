package questao3;

public class TrabalhoVoluntario extends Projeto {

    private String tipoTrabalho;
    private int duracaoTrabalho;

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;



    }

    @Override
    public boolean validaProjeto() {
        if(getDuracaoTrabalho() > 2)
            return true;
            else
                return false;

    }

    @Override
    public String imprimeProjeto() {
        return "Nome: " + getNomeProjeto() +
                "\n Descrição: " + getDescricao() +
                "\n Data inicio: " + getDataInicio() +
                "\n Data fim: " +  getDataFim() +
                "\n Tipo Trabalho: " + getTipoTrabalho() +
                "\n Duração Trabalho: " + getDuracaoTrabalho();
    }
}
