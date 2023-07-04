package com.Bus.Start.service;


import com.Bus.Start.domain.Station;
import com.Bus.Start.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StationService {
    private final StationRepository stationRepository;

    // 브랜드 추가
    // @Transactional(readOnly = true) -> StationService 클래스 전체를 ReadOnly를 취해 DB접근시 속도, 메모리 등 성능을 향상 시키고
    // 브랜드 추가의 readOnly를 풀어 DB에 값 변경을 할 수 있도록 함
    @Transactional(readOnly = false)
    public int add(Station station){
        validateDuplicateStation(station);  // 중복 브랜드 검사
        stationRepository.save(station);
        return station.getId();
    }

    private void validateDuplicateStation(Station station) {
        List<Station> findStations = stationRepository.findByName(station.getName());
        if(!findStations.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 브랜드 입니다.");
        }
    }

    // 브랜드 검색 =============================
    // 전체 검색
    public List<Station> findStations(){
        return stationRepository.findAll();
    }
    // 브랜드 id로 검색
    public Station findOne(int brandId){
        return stationRepository.findOne(brandId);
    }
    //
}
