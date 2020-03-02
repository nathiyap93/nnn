package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dashboard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T10:52:14.958+05:30[Asia/Calcutta]")
public class Dashboard   {
  @JsonProperty("TotalEvents")
  private String totalEvents = null;

  @JsonProperty("LivesImpacted")
  private String livesImpacted = null;

  @JsonProperty("TotalVolunteers")
  private String totalVolunteers = null;

  @JsonProperty("TotalParticipants")
  private String totalParticipants = null;

  public Dashboard totalEvents(String totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

  /**
   * Get totalEvents
   * @return totalEvents
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(String totalEvents) {
    this.totalEvents = totalEvents;
  }

  public Dashboard livesImpacted(String livesImpacted) {
    this.livesImpacted = livesImpacted;
    return this;
  }

  /**
   * Get livesImpacted
   * @return livesImpacted
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getLivesImpacted() {
    return livesImpacted;
  }

  public void setLivesImpacted(String livesImpacted) {
    this.livesImpacted = livesImpacted;
  }

  public Dashboard totalVolunteers(String totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(String totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public Dashboard totalParticipants(String totalParticipants) {
    this.totalParticipants = totalParticipants;
    return this;
  }

  /**
   * Get totalParticipants
   * @return totalParticipants
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTotalParticipants() {
    return totalParticipants;
  }

  public void setTotalParticipants(String totalParticipants) {
    this.totalParticipants = totalParticipants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.totalEvents, dashboard.totalEvents) &&
        Objects.equals(this.livesImpacted, dashboard.livesImpacted) &&
        Objects.equals(this.totalVolunteers, dashboard.totalVolunteers) &&
        Objects.equals(this.totalParticipants, dashboard.totalParticipants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEvents, livesImpacted, totalVolunteers, totalParticipants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    
    sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
    sb.append("    livesImpacted: ").append(toIndentedString(livesImpacted)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    totalParticipants: ").append(toIndentedString(totalParticipants)).append("\n");
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
