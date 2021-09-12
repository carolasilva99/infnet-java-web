package br.com.carolina.tp3.model.domain;

import br.com.carolina.tp3.model.exceptions.SolicitanteNaoInformadoException;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dataInicio;
    private LocalDate dataFinal;
    @OneToOne
    private Solicitante solicitante;
    private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Reserva() {
        this.dataInicio = LocalDate.now();
        this.dataFinal = LocalDate.now().plusDays(7);
    }

    public Reserva(String observacao) {
        this();
        this.observacao = observacao;
    }

    public String obterReserva() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("Reserva realizada de %s a %s para o solicitante %s.",
                this.dataInicio.format(formato),
                this.dataFinal.format(formato),
                this.solicitante);

    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("%s;%s;%s;%s",
                this.observacao,
                this.dataInicio.format(formato),
                this.dataFinal.format(formato),
                this.solicitante
        );
    }

    public void setSolicitante(Solicitante solicitante) throws SolicitanteNaoInformadoException {
        if (solicitante == null) {
            throw new SolicitanteNaoInformadoException("É necessário informar o solicitante!");
        }
        this.solicitante = solicitante;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}