package com.loljoa.server;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class LoljoaServerApplicationTests {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println(objectMapper.writeValueAsString(new TestDto()));
    }

    @Test
    void runTest() throws Exception {
        scheduleDto schedule = objectMapper.readValue(
                ResourceUtils.getFile("classpath:static/leagueSchedule.json"),
                scheduleDto.class
        );
        System.out.println(objectMapper.writeValueAsString(schedule));
    }

    @Data
    static class scheduleDto {
        List<LeagueDto> lck;
    }

    @Data
    static class LeagueDto {
        private String category;
        private String  leagueName;
        @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
        @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
        private LocalDateTime startTime;
        @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
        @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
        private LocalDateTime endTime;
    }

    static class TestDto {
        @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
        LocalDateTime time;

        public TestDto() {
            this.time = LocalDateTime.now();
        }
    }

}
