package com.bxtel.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;
/*
 * elasticsearch geo filter
 * Geo Distance Filter
 * https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-geo-distance-filter.html
 * 
 * http://docs.spring.io/spring-data/elasticsearch/docs/1.1.0.RC1/reference/html/
 * 
 * http://localhost:9200/_plugin/inquisitor/#/queries
 * 
 * Elasticsearch 权威指南（中文版）
 * http://es.xiaoleilu.com/
 * 
 * elasticsearch中文发行版
 * https://github.com/medcl/elasticsearch-rtf
 * 
 * http://localhost:9200/_analyze?analyzer=standard&pretty=true&text=%E6%88%91%E6%98%AF%E4%B8%AD%E5%9B%BD%E4%BA%BA%22
 * 
 * http://maven.oschina.net/help.html
 
 https://github.com/medcl/elasticsearch-analysis-ik
 
 http://localhost:9200/smsdatabase/_analyze?analyzer=ik&pretty=true&text=%E6%88%91%E6%98%AF%E4%B8%AD%E5%9B%BD%E4%BA%BA



index:
  analysis:
    analyzer:
      ik:
          alias: [ik_analyzer]
          type: org.elasticsearch.index.analysis.IkAnalyzerProvider
      ik_max_word:  
        type:ik
        use_smart:false
      ik_smart:
        type:ik
        use_smart:true

 */
public interface SmsSearchRepository extends ElasticsearchRepository<Sms, String>{
//	 
//	 @Query("{\"bool\" : {\"must\" : {\"field\" : {\"name\" : \"?0\"}}}}")
//	 Page<Sms> findByStatus(String status,Pageable pageable);
//	
	
	@Query("{\"bool\" : {\"must\" : {\"field\" : {\"name\" : \":status\"}}}}")
	Page<Sms> findByStatus(@Param(value = "status") String status,Pageable pageable);
	
}