package class_;

import java.util.Date;

public class Repuestorio {
    private String idRepuestorio;
    private String name;
    private Date purchDate;
    private String mark;
    private double purchPrice;
    private Categoria categoria;


    public Repuestorio() {

    }

    public Repuestorio(String idRepuestorio, String name, Date purchDate, String mark, double purchPrice, Categoria categoria) {
        this.idRepuestorio = idRepuestorio;
        this.name = name;
        this.purchDate = purchDate;
        this.mark = mark;
        this.purchPrice = purchPrice;
        this.categoria = categoria;
    }

    public String getIdRepuestorio() {
        return idRepuestorio;
    }

    public void setIdRepuestorio(String idRepuestorio) {
        this.idRepuestorio = idRepuestorio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(Date purchDate) {
        this.purchDate = purchDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPurchPrice() {
        return purchPrice;
    }

    public void setPurchPrice(double purchPrice) {
        this.purchPrice = purchPrice;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Repuestorio{" +
                "idRepuestorio='" + idRepuestorio + '\'' +
                ", name='" + name + '\'' +
                ", purchDate=" + purchDate +
                ", mark='" + mark + '\'' +
                ", purchPrice=" + purchPrice +
                ", categoria=" + categoria +
                '}';
    }
}
