package it.esercizio.viaggi_lavoro.viaggio;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@RequiredArgsConstructor
@Validated
public class TripService {

    @Autowired
    private final TripRepository tripRepository;





    //operazione GET
    public List<Trip> getTrips() {
        return tripRepository.findAll();
    }





}
