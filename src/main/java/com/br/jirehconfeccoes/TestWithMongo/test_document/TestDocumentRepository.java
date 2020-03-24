package com.br.jirehconfeccoes.TestWithMongo.test_document;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDocumentRepository extends MongoRepository<TestDocument, String> {
}
