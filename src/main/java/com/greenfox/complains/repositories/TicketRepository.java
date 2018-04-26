package com.greenfox.complains.repositories;

import com.greenfox.complains.models.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer> {
  List<Ticket> findByManufacturer(String manufacturer);
  List<Ticket> findAll();
  List<Ticket> findByReporter(String reporter);
}
