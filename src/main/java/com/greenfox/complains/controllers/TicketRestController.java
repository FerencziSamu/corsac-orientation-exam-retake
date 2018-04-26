package com.greenfox.complains.controllers;

import com.greenfox.complains.models.Ticket;
import com.greenfox.complains.models.TicketEcho;
import com.greenfox.complains.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {

  @Autowired
  TicketRepository ticketRepository;

  @GetMapping("/list/query")
  public TicketEcho returnsQueries(@ModelAttribute("ticket") Ticket ticket, @RequestParam(name =
      "manufacturer", required = false) String manufacturer, @RequestParam(value = "reporter",
      required = false) String reporter) {
    if (manufacturer != null) {
      return new TicketEcho(ticketRepository.findByManufacturer(manufacturer));
    } else if (reporter != null) {
      return new TicketEcho(ticketRepository.findByReporter(reporter));
    }
    return new TicketEcho(ticketRepository.findAll());
  }

}

