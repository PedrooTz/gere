package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooGol extends Voo{
    public VooGol(String origem, String destino, String companhia, String horaPartida, String horaChegada, String dataPartida, String dataChegada, int capacidadePsg, int numeroVoo) {
        super(origem, destino, companhia, horaPartida, horaChegada, dataPartida, dataChegada, capacidadePsg, numeroVoo);
    }
}
