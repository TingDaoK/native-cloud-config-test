package nat.cloud.config.test.client.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nat.cloud.config.test.client.persistence.Person;
import nat.cloud.config.test.client.persistence.PersonService;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@Slf4j
@RequiredArgsConstructor
public class ConfigClientCheckConfiguration {

    private final ConfigClientProperties configClientProperties;

    private final PersonService personService;

    @PostConstruct
    public void test() {
        log.info("The test property value is: {}", configClientProperties.getTest());

        personService.findAll().forEach(person -> log.info("Person found - Id:{}", person.getId()));
        personService.save(new Person());

        log.info("Environment Variables -----");
        System.getenv().forEach((key, value) -> log.info("Key: {}, Value: {}", key, value));
        log.info("---------------------------");
    }
}
