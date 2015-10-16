package psyco.user.center;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lipeng on 15/10/14.
 */
@Configuration
@SpringBootApplication
@ComponentScan("psyco.user.center")
public class AppUserCenter {
    static Logger logger = LoggerFactory.getLogger(AppUserCenter.class);
    public static void main(String[] args) {
        logger.info("----------User-Center started");
        SpringApplication.run(AppUserCenter.class);
    }
}
