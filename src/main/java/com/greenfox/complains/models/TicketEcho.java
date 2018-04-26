package com.greenfox.complains.models;

import java.util.List;

public class TicketEcho {

  private String result;
  private List<Ticket> tickets;

  public TicketEcho() {
  }

  public TicketEcho(String result, List<Ticket> tickets) {
    this.result = "ok";
    this.tickets = tickets;
  }

  public TicketEcho(List<Ticket> byManufacturer) {
    this.result = "ok";
    this.tickets = byManufacturer;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Ticket> getTickets() {
    return tickets;
  }

  public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
  }
}
