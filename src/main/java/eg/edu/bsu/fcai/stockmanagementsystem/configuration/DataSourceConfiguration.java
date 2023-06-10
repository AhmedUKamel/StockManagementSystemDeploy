package eg.edu.bsu.fcai.stockmanagementsystem.configuration;

import org.hibernate.dialect.MySQLDialect;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .url("jdbc:mysql://localhost:3306/stockDB")
//                .username("root")
//                .password("ahmed")
//                .build();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setDataSource(dataSource());
//        bean.setPackagesToScan("eg.edu.bsu.fcai.stockmanagementsystem");
//        bean.setJpaVendorAdapter(jpaVendorAdapter());
//        return bean;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setShowSql(true);
//        adapter.setDatabase(Database.MYSQL);
//        adapter.setDatabasePlatform(MySQLDialect.class.getName());
//        adapter.setGenerateDdl(true);
//        return adapter;
//    }
}
