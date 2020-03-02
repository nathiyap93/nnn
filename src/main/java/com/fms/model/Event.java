package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Entity
@Table("events")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T10:52:14.958+05:30[Asia/Calcutta]")
public class Event {
	
  @Id
  private Integer id;
  
  @JsonProperty("EventId")
  private String eventId = null;

  @JsonProperty("Month")
  private String month = null;

  @JsonProperty("BaseLocation")
  private String baseLocation = null;

  @JsonProperty("CouncilName")
  private String councilName = null;

  @JsonProperty("BeneficiaryName")
  private String beneficiaryName = null;

  @JsonProperty("EventName")
  private String eventName = null;

  @JsonProperty("EventDate")
  private OffsetDateTime eventDate = null;

  @JsonProperty("BusinessUnit")
  private String businessUnit = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("VenueAddress")
  private String venueAddress = null;

  @JsonProperty("TotalVolunteers")
  private Integer totalVolunteers = null;

  @JsonProperty("TotalVolunteerHours")
  private Integer totalVolunteerHours = null;

  @JsonProperty("TotalTravelHours")
  private Integer totalTravelHours = null;

  public Event eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Event month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "January", required = true, value = "")
      @NotNull

    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Event baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  /**
   * Get baseLocation
   * @return baseLocation
  **/
  @ApiModelProperty(example = "United Kingdom", required = true, value = "")
      @NotNull

    public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public Event councilName(String councilName) {
    this.councilName = councilName;
    return this;
  }

  /**
   * Get councilName
   * @return councilName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getCouncilName() {
    return councilName;
  }

  public void setCouncilName(String councilName) {
    this.councilName = councilName;
  }

  public Event beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

  /**
   * Get beneficiaryName
   * @return beneficiaryName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Event eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public Event businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

  /**
   * Get businessUnit
   * @return businessUnit
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public Event status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Event venueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
    return this;
  }

  /**
   * Get venueAddress
   * @return venueAddress
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getVenueAddress() {
    return venueAddress;
  }

  public void setVenueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
  }

  public Event totalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public Event totalVolunteerHours(Integer totalVolunteerHours) {
    this.totalVolunteerHours = totalVolunteerHours;
    return this;
  }

  /**
   * Get totalVolunteerHours
   * @return totalVolunteerHours
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getTotalVolunteerHours() {
    return totalVolunteerHours;
  }

  public void setTotalVolunteerHours(Integer totalVolunteerHours) {
    this.totalVolunteerHours = totalVolunteerHours;
  }

  public Event totalTravelHours(Integer totalTravelHours) {
    this.totalTravelHours = totalTravelHours;
    return this;
  }

  /**
   * Get totalTravelHours
   * @return totalTravelHours
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getTotalTravelHours() {
    return totalTravelHours;
  }

  public void setTotalTravelHours(Integer totalTravelHours) {
    this.totalTravelHours = totalTravelHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.month, event.month) &&
        Objects.equals(this.baseLocation, event.baseLocation) &&
        Objects.equals(this.councilName, event.councilName) &&
        Objects.equals(this.beneficiaryName, event.beneficiaryName) &&
        Objects.equals(this.eventName, event.eventName) &&
        Objects.equals(this.eventDate, event.eventDate) &&
        Objects.equals(this.businessUnit, event.businessUnit) &&
        Objects.equals(this.status, event.status) &&
        Objects.equals(this.venueAddress, event.venueAddress) &&
        Objects.equals(this.totalVolunteers, event.totalVolunteers) &&
        Objects.equals(this.totalVolunteerHours, event.totalVolunteerHours) &&
        Objects.equals(this.totalTravelHours, event.totalTravelHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, month, baseLocation, councilName, beneficiaryName, eventName, eventDate, businessUnit, status, venueAddress, totalVolunteers, totalVolunteerHours, totalTravelHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    councilName: ").append(toIndentedString(councilName)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    venueAddress: ").append(toIndentedString(venueAddress)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    totalVolunteerHours: ").append(toIndentedString(totalVolunteerHours)).append("\n");
    sb.append("    totalTravelHours: ").append(toIndentedString(totalTravelHours)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
