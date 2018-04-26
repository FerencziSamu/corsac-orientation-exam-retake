package com.greenfox.complains.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tickets")
public class Ticket {

  @Id
  @GeneratedValue
  private Integer id;

  private String reporter;
  private String manufacturer;
  private long serialnumber;
  private String description;

  @Column(name = "reported_at")
  private Date reportedAt;

  public Ticket() {
    this.reportedAt = new Date();
  }

  public Ticket(String reporter, String manufacturer, long serialnumber, String description) {
    this();
    this.reporter = reporter;
    this.manufacturer = manufacturer;
    this.serialnumber = serialnumber;
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public long getSerialnumber() {
    return serialnumber;
  }

  public void setSerialnumber(long serialnumber) {
    this.serialnumber = serialnumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getReportedAt() {
    return reportedAt;
  }

  public void setReportedAt(Date reportedAt) {
    this.reportedAt = reportedAt;
  }

  public String gimmiDaDate() {
    return reportedAt.toString().substring(0,10);
  }

}

