package com.my.ttms.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@Data
public class ApolloConfig {
    @Value("${secKillFlag}")
    private Boolean secKillFlag;
    @Value("${secKillStartTime}")
    private String secKillStartTime;
    @Value("${secKillEndTime}")
    private String secKillEndTime;
    @Value("${secKillPrice}")
    private float secKillPrice;
    @Value("${secKillNum}")
    private int secKillNum;
    @Value("${secKillProudeId}")
    private int secKillProudeId;
}
