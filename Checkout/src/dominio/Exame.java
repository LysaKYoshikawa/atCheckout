package dominio;

import assist.Clinica;

public abstract class Exame{

    private int codigoPaciente;
    private String nomeExame;
    private int quantidade;
    private float valorMinimoDoExame;

    public Exame() {
        nomeExame = " ";
        quantidade = 18;
        valorMinimoDoExame = 125;
    }

    public Exame(int quantidade, float valorMinimoDoExame) {
        this();
        this.quantidade = quantidade;
        this.valorMinimoDoExame = valorMinimoDoExame;
    }

    public Exame(String nomeExame, int quantidade) {
        this();
        this.nomeExame = nomeExame;
        this.quantidade = quantidade;
    }

    public Exame(String nomeExame, int quantidade, float valorMinimoDoExame) {
        this(nomeExame, quantidade);
        this.valorMinimoDoExame = valorMinimoDoExame;
    }

    public String obterStringValorPorTipoDeExame() {
        StringBuilder exames = new StringBuilder();
        exames.append(this.getExame());
        exames.append(";");
        exames.append(this.valorDoExame());
        exames.append("\r\n");

        return exames.toString();
    }
    public abstract void exibirCalculoExame();

    public abstract float valorDoExame(int posicao){
        return (quantidade[posicao] * valorMinimoDoExame[posicao])
    }

    public void imprimir(int posicao) {
        float valorTotal = valorDoExame();

        System.out.printf("%d Codigo do Paciente: %s Nome do Exame  %d Quantidade: %.2f\n   Valor do Exame: R$%.2f (%s)\n  Valor Total = R$%.2f (%s)\n",
                posicao + 1
                codigoPaciente[posicao],
                nomeExame[posicao],
                quantidade[posicao],
                valorMinimoDoExame[posicao],
                this.toString(),
                valorTotal(posicao),
        );

    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }
    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }
    public String getnomeExame() {
        return nomeExame;
    }
    public void setnomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }
    public int getQuantidade() {
        return Quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getvalorMinimoDoExame() {
        return valorMinimoDoExame;
    }
    public void setvalorMinimoDoExame(float valorMinimoDoExame) {
        this.valorMinimoDoExame = valorMinimoDoExame;
    }


}