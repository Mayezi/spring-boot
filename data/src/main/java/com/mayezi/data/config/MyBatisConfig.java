package com.mayezi.data.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangyi_lc
 * DateTime: 2019-01-08 23:03
 */
@org.springframework.context.annotation.Configuration
@MapperScan(value = "com.mayezi.data.mapper")
public class MyBatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> {
//                开启驼峰
            configuration.setMapUnderscoreToCamelCase(true);
        };
    }
}
