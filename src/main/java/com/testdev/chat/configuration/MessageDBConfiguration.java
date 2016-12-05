package com.testdev.chat.configuration;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;


@Configuration
@ComponentScan("com.testdev.chat.entity")
@EnableJpaRepositories("com.testdev.chat.dao")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class MessageDBConfiguration {

    private static final String DATABASE_DRIVER = "org.h2.Driver";
    private static final String DATABASE_PASSWORD = "faseqw12";
    private static final String DATABASE_URL = "jdbc:h2:~/chat";
    private static final String DATABASE_USERNAME = "as";
    private static final String ENTITYMANAGER_PACKAGES_TO_SCAN = "com.testdev.chat.entity";
    Properties properties = new Properties();

//    private static final String DATABASE_DRIVER = "org.postgresql.Driver";
//    private static final String DATABASE_PASSWORD = "faseqw12";
//    private static final String DATABASE_URL = "jdbc:postgresql://127.0.0.1:5432/chat";
//    private static final String DATABASE_USERNAME = "postgres";
//    private static final String ENTITYMANAGER_PACKAGES_TO_SCAN = "com.testdev.chat.entity";

    @Bean
    DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DATABASE_DRIVER);
        dataSource.setUrl(DATABASE_URL);
        dataSource.setUsername(DATABASE_USERNAME);
        dataSource.setPassword(DATABASE_PASSWORD);
               return dataSource;
    }

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emFactory = new LocalContainerEntityManagerFactoryBean();
        emFactory.setDataSource(dataSource());
        emFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        emFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties properties = new Properties();
        properties.getProperty(DATABASE_DRIVER);
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.setProperty("hbm2ddl.auto", "create");
        properties.setProperty("hibernate.id.new_generator_mappings", "false");
        emFactory.setJpaProperties(properties);
        emFactory.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);

        return emFactory;
    }

    @Bean
    JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
}
