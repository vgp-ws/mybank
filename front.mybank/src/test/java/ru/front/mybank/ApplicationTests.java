package ru.front.mybank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.utility.TestcontainersConfiguration;

import ru.front.mybank.repository.initializers.PostgreSQLContainerInitializer;
import ru.front.mybank.security.TestSecurityConfig;

@SpringBootTest
@ActiveProfiles("test")
@Import({ TestcontainersConfiguration.class, TestSecurityConfig.class })
@ContextConfiguration(initializers = PostgreSQLContainerInitializer.class)
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
