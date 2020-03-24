package com.br.jirehconfeccoes.TestWithMongo.test_document_sql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testDocumentSql")
public class TestDocumentSqlRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestDocumentSqlRest.class);
    private final TestDocumentSqLService testDocumentSqLService;

    public TestDocumentSqlRest(TestDocumentSqLService testDocumentSqLService) {
        this.testDocumentSqLService = testDocumentSqLService;
    }

    @PostMapping("/save")
    public TestDocumentSql save(@RequestBody TestDocumentSql testDocumentSql) {

        LOGGER.info("Enviando requisição para salvar o dados inseridos dentro do documneto");

        return testDocumentSqLService.save(testDocumentSql);
    }
}
