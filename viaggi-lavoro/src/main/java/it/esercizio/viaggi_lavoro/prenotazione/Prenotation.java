package it.esercizio.viaggi_lavoro.prenotazione;

import it.esercizio.viaggi_lavoro.viaggio.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prenotazione", uniqueConstraints = @UniqueConstraint(columnNames = {
        "dipendente_id", "data_richiesta"
}))
public class Prenotation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    private LocalDate data_richiesta;
    private String note;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;


}
