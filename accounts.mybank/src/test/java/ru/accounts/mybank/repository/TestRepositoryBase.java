package ru.accounts.mybank.repository;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.junit.jupiter.Testcontainers;

import ru.accounts.mybank.repository.initializers.PostgreSQLContainerInitializer;

@SpringBootTest
@Testcontainers
@ActiveProfiles("test")
@ContextConfiguration(initializers = { PostgreSQLContainerInitializer.class })
public class TestRepositoryBase {

}
