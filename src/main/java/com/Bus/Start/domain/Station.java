package com.Bus.Start.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Station {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id; // 정류장 번호

    @Column(name = "NAME")
    private String name;   // 정류장명

    @Column(name = "LATITUDE")
    private float latitude; // 위도

    @Column(name = "LONGITUDE")
    private float longitude; // 경도

    @Column(name = "CREATED_AT")
    private Date created_at; // 정보수집일

    @Column(name = "MOBILE_ID")
    private int mobileId;   // 모바일 단축번호

    @Column(name = "CITY_ID")
    private int cityId;     // 도시코드

    @Column(name = "CITY_NAME")
    private String cityName; // 도시명

    @Column(name = "MANAGER")
    private String manager;  // 관리도시명

}
