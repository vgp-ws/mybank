package ru.front.mybank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.front.mybank.model.domain.Template;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {

}
