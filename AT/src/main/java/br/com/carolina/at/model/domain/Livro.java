package br.com.carolina.at.model.domain;

import br.com.carolina.at.model.exceptions.DisciplinaNaoPreenchidaException;
import br.com.carolina.at.model.exceptions.IdiomaNaoPreenchidoException;
import br.com.carolina.at.model.exceptions.RamoNaoPreenchidoException;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private float valorAluguel;
    private boolean usado;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Livro(String titulo, String autor, float valorAluguel, boolean usado) {
        this.titulo = titulo;
        this.autor = autor;
        this.valorAluguel = valorAluguel;
        this.usado = usado;
    }

    public Livro() {

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
