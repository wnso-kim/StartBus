package com.Bus.Start.domain;
import com.Bus.Start.domain.Station;


import jakarta.persistence.*;

@Entity
public class Route {
    @Id @GeneratedValue
    @Column(name = "ROUTE_ID")
    private int id;
//
//    @Column(name = "STATION_ID")
//    @OneToMany(mappedBy = "STATION_ID")
//    private Station station;
}
