package ru.front.mybank.repository;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.junit.jupiter.Testcontainers;

import ru.front.mybank.repository.initializers.PostgreSQLContainerInitializer;

@SpringBootTest
@Testcontainers
@ActiveProfiles("test")
@ContextConfiguration(initializers = { PostgreSQLContainerInitializer.class })
public class TestRepositoryBase {

}
