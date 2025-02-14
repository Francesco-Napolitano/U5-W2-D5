package it.esercizio.viaggi_lavoro.dipendenti;

import it.esercizio.viaggi_lavoro.prenotazione.Prenotation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dipendente")
public class Dipendent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;
    private String nome;
    private String cognome;
    private String email;

    @OneToMany
    @JoinColumn(name = "dipendente_id")
    private Set<Prenotation> prenotazioni;



}
