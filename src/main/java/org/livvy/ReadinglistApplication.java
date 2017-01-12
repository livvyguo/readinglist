package org.livvy;

import org.activiti.engine.*;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("org.livvy.reading.mapper")
@EnableTransactionManagement
public class ReadinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadinglistApplication.class, args);
	}

	@Bean
	public CharacterEncodingFilter initializeCharacterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}

	@Bean(name="dataSource")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}

    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

	@Bean(name = "processEngineConfiguration")
	public SpringProcessEngineConfiguration initializeSpringProcessEngineConfiguration(
	    DataSource dateSource,
        PlatformTransactionManager transactionManager) {
		SpringProcessEngineConfiguration processEngineConfiguration = new SpringProcessEngineConfiguration();
		processEngineConfiguration.setDataSource(dateSource);
		processEngineConfiguration.setTransactionManager(transactionManager);
		processEngineConfiguration.setDatabaseSchemaUpdate("true");
		return processEngineConfiguration;
	}


	@Bean
    public ProcessEngineFactoryBean initializeProcessEngineFactoryBean(
        SpringProcessEngineConfiguration processEngineConfiguration) {
        ProcessEngineFactoryBean processEngineFactoryBean = new ProcessEngineFactoryBean();
        processEngineFactoryBean.setProcessEngineConfiguration(processEngineConfiguration);
        return processEngineFactoryBean;
    }


    @Bean
    public RuntimeService initializeRuntimeService(ProcessEngine processEngine) {
        return processEngine.getRuntimeService();
    }

    @Bean
    public IdentityService initializeIdentityService(ProcessEngine processEngine) {
        return processEngine.getIdentityService();
    }

    @Bean
    public FormService initializeFormService(ProcessEngine processEngine) {
        return processEngine.getFormService();
    }

    @Bean
    public RepositoryService initializeRepositoryService(ProcessEngine processEngine) {
        return processEngine.getRepositoryService();
    }

    @Bean
    public TaskService initializeTaskService(ProcessEngine processEngine) {
        return processEngine.getTaskService();
    }

    @Bean
    public HistoryService initializeHistoryService(ProcessEngine processEngine) {
        return processEngine.getHistoryService();
    }

    @Bean
    public ManagementService initializeManagementService(ProcessEngine processEngine) {
        return processEngine.getManagementService();
    }

}
