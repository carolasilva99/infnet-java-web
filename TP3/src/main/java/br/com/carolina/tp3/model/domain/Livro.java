package br.com.carolina.tp3.model.domain;

import br.com.carolina.tp3.model.exceptions.DisciplinaNaoPreenchidaException;
import br.com.carolina.tp3.model.exceptions.IdiomaNaoPreenchidoException;
import br.com.carolina.tp3.model.exceptions.RamoNaoPreenchidoException;

public abstract class Livro {
    private String titulo;
    private String autor;
    private float valorAluguel;
    private boolean usado;

    public Livro(String titulo, String autor, float valorAluguel, boolean usado) {
        this.titulo = titulo;
        this.autor = autor;
        this.valorAluguel = valorAluguel;
        this.usado = usado;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public String obterLivro() throws DisciplinaNaoPreenchidaException, IdiomaNaoPreenchidoException, RamoNaoPreenchidoException {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.titulo);
        stringBuilder.append(";");
        stringBuilder.append(this.autor);
        stringBuilder.append(";");
        stringBuilder.append(this.calcularValorBruto());
        stringBuilder.append("\r\n");

        return stringBuilder.toString();
    }

    public abstract float calcularValorBruto() throws DisciplinaNaoPreenchidaException, IdiomaNaoPreenchidoException, RamoNaoPreenchidoException;
}
