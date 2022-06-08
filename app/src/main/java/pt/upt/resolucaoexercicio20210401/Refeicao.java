package pt.upt.resolucaoexercicio20210401;

import java.io.Serializable;

public class Refeicao  implements Serializable {
    private int diaDaSemana;
    private String Sopa;
    private String PratoDeCarne;
    private String PratoDePeixe;
    private String Sobremesa;

    public Refeicao(int diaDaSemana, String sopa, String pratoDeCarne, String pratoDePeixe, String sobremesa) {
        this.diaDaSemana = diaDaSemana;
        Sopa = sopa;
        PratoDeCarne = pratoDeCarne;
        PratoDePeixe = pratoDePeixe;
        Sobremesa = sobremesa;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(int diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getSopa() {
        return Sopa;
    }

    public void setSopa(String sopa) {
        Sopa = sopa;
    }

    public String getPratoDeCarne() {
        return PratoDeCarne;
    }

    public void setPratoDeCarne(String pratoDeCarne) {
        PratoDeCarne = pratoDeCarne;
    }

    public String getPratoDePeixe() {
        return PratoDePeixe;
    }

    public void setPratoDePeixe(String pratoDePeixe) {
        PratoDePeixe = pratoDePeixe;
    }

    public String getSobremesa() {
        return Sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        Sobremesa = sobremesa;
    }
}
