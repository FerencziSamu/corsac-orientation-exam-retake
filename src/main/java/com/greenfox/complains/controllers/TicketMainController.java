package com.greenfox.complains.controllers;

import com.greenfox.complains.models.Ticket;
import com.greenfox.complains.models.User;
import com.greenfox.complains.repositories.TicketRepository;
import com.greenfox.complains.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketMainController {

  TicketRepository ticketRepository;

  UserRepository userRepository;

  public TicketMainController(TicketRepository ticketRepository, UserRepository userRepository) {
    this.ticketRepository = ticketRepository;
    this.userRepository = userRepository;
  }

  @GetMapping("/list")
  public String renderIndexWithAllTickets(Model model) {
    model.addAttribute("tickets", ticketRepository.findAll());
    return "index";
  }

  @GetMapping("/")
  public String renderMainPage(@ModelAttribute(name = "user") User user, Model model) {
    model.addAttribute("users", userRepository.findAll());
    return "reportPage";
  }

  @PostMapping("/report")
  public String loadsIndexWithNewError(@ModelAttribute(name = "ticket") Ticket ticket) {
    ticketRepository.save(ticket);
    return "redirect:/list";
  }

}

