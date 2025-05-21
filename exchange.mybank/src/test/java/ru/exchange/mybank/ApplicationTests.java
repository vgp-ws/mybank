package ru.exchange.mybank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import ru.exchange.mybank.security.TestSecurityConfig;

@SpringBootTest
@ActiveProfiles("test")
@Import({ TestSecurityConfig.class })
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
