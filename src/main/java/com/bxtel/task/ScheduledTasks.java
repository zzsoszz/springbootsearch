package com.bxtel.task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.elasticsearch.client.Client;
import org.elasticsearch.node.NodeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bxtel.search.CimTpcHtlInfoT;
import com.bxtel.search.CimTpcHtlInfoTSearchRepository;
import com.bxtel.search.Sms;
import com.bxtel.search.SmsSearchRepository;

/*
 * Spring Boot:在Spring Boot中使用定时任务
 * http://www.tuicool.com/articles/ayau2i
 */

@Component
public class ScheduledTasks {

	@Autowired
	SmsSearchRepository  searchrepository;
	
	@Autowired
	CimTpcHtlInfoTSearchRepository cimTpcHtlInfoTSearchRepository;
	
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTime() {
//        System.out.println("The time is now " + dateFormat.format(new Date()));
//    }
    
    
//    @Scheduled(fixedRate = 5000)
//    public void resend() throws Exception {
//    	 List<Sms> smslist = repository.findALLBySatus("3");
//    	 for(Sms sms:smslist)
//    	 {
//    		 smsbo.send(sms);
//    	 }
//    }
  
  static int index;
  
  @Scheduled(fixedRate = 5000000)
  public void resend() throws Exception {
	
	CimTpcHtlInfoT entity=new CimTpcHtlInfoT();
	entity.setHotelName("酒店："+index++);
	cimTpcHtlInfoTSearchRepository.save(entity);
	
	
//  	 com.bxtel.search.Sms sms=new com.bxtel.search.Sms();
//  	 sms.setContent("hello："+index++);
//	 searchrepository.save(sms);
//	 
//	 
//	 long start= System.currentTimeMillis();
//	 System.out.println();
//	 for(int j=0;j<10000;j++)
//	 {
//		 ArrayList<Sms> entities=new ArrayList<Sms>();
//		 for(int i=0;i<1000;i++)
//		 {
//			 com.bxtel.search.Sms sms=new com.bxtel.search.Sms();
//		  	 sms.setContent("hello："+index++);
//			 entities.add(sms);
//		 }
//		 searchrepository.save(entities);
//	 }
//	 long end=  System.currentTimeMillis();
//	 System.out.println("index is fineshed:time:"+(end-start)/1000);
//	 
//	 
//	 
	 //elasticsearchTemplate.bulkIndex(queries);
	 /**
	  * https://www.elastic.co/blog/found-java-clients-for-elasticsearch
	  */
//	 
//    Client client = NodeBuilder.nodeBuilder()
//         .client(true)
//         .node()
//         .client();
//    boolean indexExists = client.admin().indices().prepareExists(INDEX).execute().actionGet().isExists();
//    if (indexExists) {
//        client.admin().indices().prepareDelete(INDEX).execute().actionGet();
//    }
//    client.admin().indices().prepareCreate(INDEX).execute().actionGet();
//
//    SearchResponse allHits = client.prepareSearch(Indexer.INDEX)
//                                .addFields("title", "category")
//                                .setQuery(QueryBuilders.matchAllQuery())
//                                .execute().actionGet();
	    
  }
  
}