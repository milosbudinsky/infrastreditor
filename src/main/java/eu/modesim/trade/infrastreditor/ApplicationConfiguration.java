package eu.modesim.trade.infrastreditor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
class ApplicationConfiguration {

  @Bean
  MongoClient mongoClient() {
      return MongoClients.create("mongodb://mongo:kaVUGGePzhZXKJXMCayptBadsnKKhgNF@mongodb.railway.internal:27017");
      
  }

  @Bean
  MongoOperations mongoTemplate(MongoClient mongoClient) {
      return new MongoTemplate(mongoClient, "geospatial");
  }
}