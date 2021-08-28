package br.com.carolina.tp3.model.domain;

import br.com.carolina.tp3.model.exceptions.DisciplinaNaoPreenchidaException;

public class Didatico extends Livro {
    private String disciplina;
    private String serie;
    private boolean conservado;

    public Didatico(String titulo, String autor, float valorAluguel, boolean usado) {
        super(titulo, autor, valorAluguel, usado);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(this.disciplina);
        stringBuilder.append(";");
        stringBuilder.append(this.serie);
        stringBuilder.append(";");
        stringBuilder.append(this.conservado ? "S" : "N");

        return stringBuilder.toString();
    }

    @Override
    public float calcularValorBruto() throws DisciplinaNaoPreenchidaException {
        if (disciplina.isBlank()) {
            throw new DisciplinaNaoPreenchidaException("[LIVRO DIDÁTICO] O campo disciplina não foi preenchido!");
        }

        float valorDisciplina = 2.5f;
        if ("MATEMATICA".equalsIgnoreCase(disciplina) || "MATEMÁTICA".equalsIgnoreCase(disciplina)) {
            valorDisciplina = 4;
        }

        float valorConservacao = 0;
        if (this.conservado) {
            valorConservacao = 2;
        }

        return this.getValorAluguel() + valorDisciplina + valorConservacao;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setConservado(boolean conservado) {
        this.conservado = conservado;
    }
}