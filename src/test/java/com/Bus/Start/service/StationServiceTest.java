package com.Bus.Start.service;

import com.Bus.Start.domain.Station;
import com.Bus.Start.repository.StationRepository;
import jakarta.persistence.EntityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StationServiceTest {

    @Autowired StationService stationService;
    @Autowired StationRepository stationRepository;
    @Autowired EntityManager em;

    @Test
    public void func() throws Exception{
        정류소추가();
        정류소확인();
    }

    @Test
    public void 정류소추가() throws Exception{
        //given
        Station station = new Station();

        //when
        int saveId = stationService.add(station);
        System.out.println("savedId: " + saveId);

        //then
        em.flush();
        assertEquals(station, stationRepository.findOne(saveId));
    }

    @Test
    public void 정류소확인() throws Exception{
        int Id = stationService.findOne(1).getId();
        System.out.println("valid: " + Id);
    }

    public java.sql.Date sqlDate(){
        Date utilDate = new Date();
        long milliSeconds = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(milliSeconds);

        return sqlDate;
    }

}
