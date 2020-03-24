package com.br.jirehconfeccoes.TestWithMongo.test_document_sql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDocumentSqlRepository extends JpaRepository<TestDocumentSql, Long> {
}
