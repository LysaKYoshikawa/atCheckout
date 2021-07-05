package dominio;

import restriction.ValorAbaixoRestrictions;
import restriction.DadosDoExameIncompletoRestrictions;

public class Clinica {

    private String nomeExame;
    private String nomeClinica;
    private String endereco;
    private float valorDosExames;

    public void imprimir() throws DadosDoExameIncompletoRestriction {
        System.out.println(this.getExame());
    }

    public StringBuilder getExame() throws DadosDoExameIncompletoRestriction {

        if(nomeExame == null || nomeClinica == null) {
            throw new DadosDoExameIncompletoRestriction("Dados Incorretos!!!");
        }

        StringBuilder exames = new StringBuilder();

        exames.append(nomeClinica.toUpperCase().charAt(0));
        exames.append(".");
        exames.append(", ");
        exames.append(nomeExame.toUpperCase());
        exames.append(" ");
        exames.append(endereco.toLowerCase());

        return exames;
    }

    public float getValor() {
        return valorDosExames;
    }

    public void setValor(float valorDosExames) throws ValorAbaixoRestrictions {

        if(valorDosExames < 80) {
            throw new ValorAbaixoRestrictions("Valor abaixo do limite");
        }
        this.valorDosExames = valorDosExames;
    }



}