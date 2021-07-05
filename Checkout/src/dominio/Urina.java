package dominio;

public class Urina extends Exame {

    private float desconto;
    private float tipo1;
    private String convenio;


    @Override
    public String toString() {
        return String.format("%.2f - %s", desconto, tipo1, convenio);
    }

    @Override
    public void exibirCalculoExameo() {
        System.out.println("= Valor minimo do exame - desconto + Tipo de exame e Nome Paciente");
        System.out.println("= " + getvalorMinimoDoExame() + " - " + desconto + "+" + tipo1 + convenio );
        System.out.println("= " + valorDoExame());
    }

    @Override
    public float valorDoExame() {
        return getvalorMinimoDoExame() - desconto + tipo1;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getTipo1() {
        return tipo1;
    }

    public void setTipo1(float tipo1) {
        this.tipo1 = tipo1;
    }
    public float getConvenio() {
        return convenio;
    }

    public void setConvenio(float convenio) {
        this.convenio = convenio;
    }
}