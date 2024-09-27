package nat.cloud.config.test.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import software.amazon.awssdk.crt.CRT;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ConfigClientApplication {

    public static void main(String[] args) {

        new CRT();
        new SpringApplicationBuilder(ConfigClientApplication.class).run(args);
    }
}
