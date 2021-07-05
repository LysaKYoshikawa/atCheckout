package dominio;

public class Sangue extends Exame{

    private float desconto;
    private float valorPreparatorio1;
    private float ValorPreparatorio2;

    public Sangue(){
        desconto = 10,50;
        valorPreparatorio1 = 125;
        valorPreparatorio2 = 220;
    }

    private static float valorDosPreparatorios(){
        return valorPreparatorio1 + valorPreparatorio2;
    }

    public Sangue(){
        this.setnomeExame("Hemograma");
    }

    public Sangue(String nomeExame, int quantidade) {
        super(nomeExame, quantidade);
    }

    @Override
    public void exibirCalculoExame(){
        System.ou.println(" Valor Minimo do Exame + Valor dos Preparadorios - Desconto ");
        System.out.println("= " getvalorMinimoDoExame + valorPreparatorio1 + "+" + valorPreparatorio2 "-" + desconto );
        System.out.println("= " + valorDoExame() );


    }
    @Override
    public String toString() {
        return String.format("%.2f - %.2f", valorPreparatorio1, valorPreparatorio2, desconto);
    }

    @Override
    public float valorDoExame() {
        return getvalorMinimoDoExame() + valorPreparatorio1 + valorPreparatorio2 - desconto;
    }

    public float getDesconto() {
        return desconto;
    }
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    public float getValorPreparatorio1() {
        return valorPreparatorio1;
    }
    public void setValorPreparatorio1(float valorPreparatorio1) {
        this.valorPreparatorio1 = valorPreparatorio1;

    }
    public float getValorPreparatorio2() {
        return valorPreparatorio2;
    }
    public void setValorPreparatorio2(float valorPreparatorio2) {
        this.valorPreparatorio2 = valorPreparatorio2;

    }




}