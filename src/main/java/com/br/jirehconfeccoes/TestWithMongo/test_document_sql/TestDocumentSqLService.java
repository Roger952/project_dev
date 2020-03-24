package com.br.jirehconfeccoes.TestWithMongo.test_document_sql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestDocumentSqLService {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestDocumentSqLService.class);
    private final TestDocumentSqlRepository testDocumentSqlRepository;

    public TestDocumentSqLService(TestDocumentSqlRepository testDocumentSqlRepository) {
        this.testDocumentSqlRepository = testDocumentSqlRepository;
    }

    public TestDocumentSql save(TestDocumentSql testDocumentSql) {
        LOGGER.info("Salvando as informações contidas dentro dos documentos");

        return testDocumentSqlRepository.save(testDocumentSql);
    }

}
