package org.ale.gowiththeflow.config;

import org.flowable.spring.ProcessEngineFactoryBean;
import org.springframework.boot.SpringBootConfiguration;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ProcessEngineConfig {

    @Bean
    public SpringProcessEngineConfiguration processEngineConfiguration(){
        return new SpringProcessEngineConfiguration();
    }

    @Bean
    public ProcessEngineFactoryBean processEngine(SpringProcessEngineConfiguration processEngineConfiguration){
        return new ProcessEngineFactoryBean();

    }

}
