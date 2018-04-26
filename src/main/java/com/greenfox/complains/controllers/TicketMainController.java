package com.greenfox.complains.controllers;

import com.greenfox.complains.repositories.TicketRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketMainController {

  TicketRepository ticketRepository;

  public TicketMainController(TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;
  }

  @GetMapping("/list")
  public String renderIndexWithAllTickets(Model model) {
    model.addAttribute("tickets",ticketRepository.findAll());
    return "index";
  }

}

