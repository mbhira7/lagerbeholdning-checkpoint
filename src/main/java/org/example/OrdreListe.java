package org.example;

import java.util.List;

public class OrdreListe {

    List<Ordre> ordreListe;

    public OrdreListe(List<Ordre> ordreListe) {
        this.ordreListe = ordreListe;
    }

    public List<Ordre> getOrdreProssesering() {
        return ordreListe;
    }
}
