package ru.template.mybank.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ru.template.mybank.model.domain.Template;

class TemplateRepositoryTest extends TestRepositoryBase {

    @Autowired
    private TemplateRepository templateRepository;

    @Test
    void testSave_shouldSaveTemplatetoDB() {

        Template template = new Template();

        assertThat(templateRepository.count()).isZero();

        templateRepository.save(template);

        assertThat(templateRepository.count()).isEqualTo(1);

    }
}
