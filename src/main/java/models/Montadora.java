package models;

import java.util.List;

import jakarta.persistence.OneToMany;

public enum Montadora {
    VOLKSWAGEN(new String[]{"Gol", "Polo", "Saveiro"}),
    FIAT(new String[]{"Uno", "Argo", "Palio"}),
    CHEVROLET(new String[]{"Onix", "Corsa", "S10"}),
    TOYOTA(new String[]{"Corolla", "Hilux", "Etios"});

    private final String[] modelos;

    Montadora(String[] modelos) {
        this.modelos = modelos;
    }

    public String[] getModelos() {
        return modelos;
    }
    
    @OneToMany(mappedBy = "montadora")
    private List<Carro> carros;
}

