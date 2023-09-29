package questao3;

import java.util.Objects;

public class DistribuicaoAlimento extends Projeto {

    private String descAlimento;
    private float qtde;

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio);
        this.descAlimento = descAlimento;
        this.qtde = qtde;



        }

    @Override
    public boolean validaProjeto() {
        if(Objects.equals(getDataFim(), ""))
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
                "\n Descrição alimento: " + getDescAlimento() +
                "\n Quandidade: " + getQtde();
    }
}

