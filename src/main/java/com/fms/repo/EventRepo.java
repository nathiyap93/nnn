package com.fms.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fms.model.Event;
import reactor.core.publisher.Flux;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@Component
@Repository
public interface EventRepo extends ReactiveCrudRepository<Event, Integer>{

//	public Flux<Event> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
		// some error
	@Query("select * from events where EventId = 1")
	Flux<Event> findAll(String EventId);

}
