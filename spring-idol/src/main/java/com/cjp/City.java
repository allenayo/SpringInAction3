package com.cjp;

public class City {
    private String name;
    private String state;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();
    }
}
