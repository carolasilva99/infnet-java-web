package br.com.carolina.at.model.domain;

import br.com.carolina.at.model.exceptions.RamoNaoPreenchidoException;

import javax.persistence.Entity;

@Entity
public class Cientifico extends Livro {
    private String ramo;
    private int volumes;


    public Cientifico(String titulo, String autor, float valorAluguel, boolean usado) {
        super(titulo, autor, valorAluguel, usado);
    }

    public Cientifico() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(ramo);
        stringBuilder.append(";");
        stringBuilder.append(volumes);

        return stringBuilder.toString();
    }

    @Override
    public float calcularValorBruto() throws RamoNaoPreenchidoException {
        if (ramo.isBlank()) {
            throw new RamoNaoPreenchidoException("[LIVRO CIENTÍFICO] Ramo do livro não foi preenchido!");
        }

        float valorPoucosVolumes = 2;
        if (this.volumes >= 6) {
            valorPoucosVolumes = 3;
        }

        return this.getValorAluguel() + valorPoucosVolumes;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public String getRamo() {
        return ramo;
    }

    public int getVolumes() {
        return volumes;
    }
}