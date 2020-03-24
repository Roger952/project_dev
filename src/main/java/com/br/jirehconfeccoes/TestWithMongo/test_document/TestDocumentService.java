package com.br.jirehconfeccoes.TestWithMongo.test_document;


import com.br.jirehconfeccoes.TestWithMongo.equations_in_mongo.EquationsInMongodbService;
import com.br.jirehconfeccoes.TestWithMongo.test_document_sql.TestDocumentSqLService;
import com.br.jirehconfeccoes.TestWithMongo.test_document_sql.TestDocumentSql;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;

@Service
public class TestDocumentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestDocumentService.class);

    private final TestDocumentRepository testDocumentRepository;
    private final TestDocumentSqLService testDocumentSqLService;
    private final EquationsInMongodbService equationsInMongodbService;

    public TestDocumentService(TestDocumentRepository testDocumentRepository, TestDocumentSqLService testDocumentSqLService, EquationsInMongodbService equationsInMongodbService) {
        this.testDocumentRepository = testDocumentRepository;
        this.testDocumentSqLService = testDocumentSqLService;
        this.equationsInMongodbService = equationsInMongodbService;
    }

    public TestDocument save(String description, String codEquation, MultipartFile multipartFile) throws IOException, ScriptException {

        LOGGER.info("Salvando a informação inserida no MongoDB");

        TestDocument testDocument = convertDocumentToEntity(description, codEquation, multipartFile);

        return testDocumentRepository.save(testDocument);
    }

    private TestDocument convertDocumentToEntity(String description, String codEquation, MultipartFile multipartFile) throws IOException, ScriptException {

        TestDocument testDocument = new TestDocument();

        testDocument.setDescriptionDocument(description);

        testDocument.setDocument(multipartFile.getBytes());

        testDocument.setNameDocument(multipartFile.getOriginalFilename());

        LOGGER.info("Arquivo convertido e pronto para ser calculado" + testDocument.getNameDocument());

        sendContentForDocument(multipartFile, codEquation);

        return testDocument;
    }


    private void sendContentForDocument(MultipartFile multipartFile, String codEquation) throws IOException, ScriptException {

        XSSFWorkbook workbook = new XSSFWorkbook(multipartFile.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);

        for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
            TestDocumentSql testDocumentSql = new TestDocumentSql();

            XSSFRow row = worksheet.getRow(i);

            testDocumentSql.setValorA(row.getCell(0).getNumericCellValue());
            testDocumentSql.setValorB(row.getCell(1).getNumericCellValue());
            testDocumentSql.setValorC(row.getCell(1).getNumericCellValue());
            testDocumentSql.setResult(calculator(testDocumentSql, codEquation));

            testDocumentSqLService.save(testDocumentSql);
        }
    }

    private Integer calculator(TestDocumentSql testDocumentSql, String codEEquation) throws ScriptException {

        String equation = equationsInMongodbService.findByCod(codEEquation).getEquation();

        equation = equation.replaceAll("a", testDocumentSql.getValorA().toString())
                .replaceAll("b", testDocumentSql.getValorB().toString())
                .replaceAll("c", testDocumentSql.getValorC().toString());

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

        Double resultValor = Double.parseDouble(engine.eval(equation).toString());

        Math.floor(resultValor);

        return resultValor.intValue();
    }
}
