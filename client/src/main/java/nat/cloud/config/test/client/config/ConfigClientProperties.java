package nat.cloud.config.test.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "config-client")
@Data
public class ConfigClientProperties {

    private String test;
}
