package org.pixel.service;

import org.pixel.model.NNPlace;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class NNService {

    public NNService() {
    }

    public List<NNPlace> getNN(List<NNPlace> places) {

        List<NNPlace> nnPlaces = new LinkedList<>() {{
            add(places.get(0));
        }};

        while (places.size() != 0) {
            NNPlace nnPlace = getNearliestPlace(nnPlaces.get(nnPlaces.size() - 1), places);
            nnPlaces.add(nnPlace);
            places.remove(nnPlace);
        }
        return nnPlaces;
    }

    private NNPlace getNearliestPlace(NNPlace comparable, List<NNPlace> places) {

        places.remove(comparable);
        NNPlace winner = places.get(0);

        for (NNPlace place : places)
            if (euklidesDistance(comparable, winner) > euklidesDistance(comparable, place))
                winner = place;

        return winner;
    }

    private double euklidesDistance(NNPlace stPlace, NNPlace ndPlace) {
        return Math.sqrt((stPlace.getLatitude() - ndPlace.getLatitude()) * (stPlace.getLatitude() - ndPlace.getLatitude()) +
                (stPlace.getLongitude() - ndPlace.getLongitude()) * (stPlace.getLongitude() - ndPlace.getLongitude()));
    }
}
