package com.br.jirehconfeccoes.TestWithMongo.test_document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.script.ScriptException;
import java.io.IOException;

@RestController
@RequestMapping("/testdocuments")
public class TestDocumentRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestDocumentRest.class);
    private final TestDocumentService testDocumentService;

    public TestDocumentRest(TestDocumentService testDocumentService) {
        this.testDocumentService = testDocumentService;
    }

    @PostMapping("save")
    public TestDocument save(@RequestParam("descriptionFile") String description,
                             @RequestParam("codEquation") String cod,
                             @RequestParam("document") MultipartFile multipartFile) throws IOException, ScriptException {
        LOGGER.info("Enviando requisição para savar o documento inserido");

        return testDocumentService.save(description, cod, multipartFile);
    }
}
