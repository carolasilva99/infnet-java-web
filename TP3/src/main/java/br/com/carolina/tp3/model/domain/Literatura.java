package br.com.carolina.tp3.model.domain;

import br.com.carolina.tp3.model.exceptions.IdiomaNaoPreenchidoException;

public class Literatura extends Livro {
    private String genero;
    private String idioma;

    public Literatura(String titulo, String autor, float valorAluguel, boolean usado) {
        super(titulo, autor, valorAluguel, usado);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(this.genero);
        stringBuilder.append(";");
        stringBuilder.append(this.idioma);

        return stringBuilder.toString();
    }

    @Override
    public float calcularValorBruto() throws IdiomaNaoPreenchidoException {
        if(idioma.isBlank()) {
            throw new IdiomaNaoPreenchidoException("[LIVRO DE LITERATURA] O idioma não foi preenchido!");
        }

        float precoIdioma = 2;
        if (!"pt".equalsIgnoreCase(this.idioma)) {
            precoIdioma = 4;
        }

        return this.getValorAluguel() + precoIdioma;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
