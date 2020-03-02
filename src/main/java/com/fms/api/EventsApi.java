/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.fms.api;

import com.fms.model.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T10:52:14.958+05:30[Asia/Calcutta]")
@Api(value = "events", description = "the events API")
public interface EventsApi {

    Logger log = LoggerFactory.getLogger(EventsApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new event", nickname = "addEvent", notes = "", response = Event.class, tags={ "Event Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 404, message = "Page not found") })
    @RequestMapping(value = "/events",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    default ResponseEntity<Event> addEvent(@ApiParam(value = "Event that needs to be added" ,required=true )  @Valid @RequestBody Event body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"Status\" : \"Status\",\r\n  \"VenueAddress\" : \"VenueAddress\",\r\n  \"EventDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"TotalVolunteers\" : 0,\r\n  \"BeneficiaryName\" : \"BeneficiaryName\",\r\n  \"TotalTravelHours\" : 1,\r\n  \"CouncilName\" : \"CouncilName\",\r\n  \"EventName\" : \"EventName\",\r\n  \"Month\" : \"January\",\r\n  \"BusinessUnit\" : \"BusinessUnit\",\r\n  \"EventId\" : \"EventId\",\r\n  \"TotalVolunteerHours\" : 6,\r\n  \"BaseLocation\" : \"United Kingdom\"\r\n}", Event.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default EventsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get total events on clicking view", nickname = "allEvents", notes = "All the events are listed when clicked on view after login", response = Event.class, responseContainer = "List", tags={ "Event Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 404, message = "Page not found") })
    @RequestMapping(value = "/events",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Event>> allEvents() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\r\n  \"Status\" : \"Status\",\r\n  \"VenueAddress\" : \"VenueAddress\",\r\n  \"EventDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"TotalVolunteers\" : 0,\r\n  \"BeneficiaryName\" : \"BeneficiaryName\",\r\n  \"TotalTravelHours\" : 1,\r\n  \"CouncilName\" : \"CouncilName\",\r\n  \"EventName\" : \"EventName\",\r\n  \"Month\" : \"January\",\r\n  \"BusinessUnit\" : \"BusinessUnit\",\r\n  \"EventId\" : \"EventId\",\r\n  \"TotalVolunteerHours\" : 6,\r\n  \"BaseLocation\" : \"United Kingdom\"\r\n}, {\r\n  \"Status\" : \"Status\",\r\n  \"VenueAddress\" : \"VenueAddress\",\r\n  \"EventDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"TotalVolunteers\" : 0,\r\n  \"BeneficiaryName\" : \"BeneficiaryName\",\r\n  \"TotalTravelHours\" : 1,\r\n  \"CouncilName\" : \"CouncilName\",\r\n  \"EventName\" : \"EventName\",\r\n  \"Month\" : \"January\",\r\n  \"BusinessUnit\" : \"BusinessUnit\",\r\n  \"EventId\" : \"EventId\",\r\n  \"TotalVolunteerHours\" : 6,\r\n  \"BaseLocation\" : \"United Kingdom\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default EventsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get the specific event detail", nickname = "eventId", notes = "The event detail listed are depending upon the id selected", response = Event.class, tags={ "Event Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 404, message = "Page not found") })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Event> eventId(@ApiParam(value = "ID of event to return",required=true) @PathVariable("eventId") Long eventId
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"Status\" : \"Status\",\r\n  \"VenueAddress\" : \"VenueAddress\",\r\n  \"EventDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"TotalVolunteers\" : 0,\r\n  \"BeneficiaryName\" : \"BeneficiaryName\",\r\n  \"TotalTravelHours\" : 1,\r\n  \"CouncilName\" : \"CouncilName\",\r\n  \"EventName\" : \"EventName\",\r\n  \"Month\" : \"January\",\r\n  \"BusinessUnit\" : \"BusinessUnit\",\r\n  \"EventId\" : \"EventId\",\r\n  \"TotalVolunteerHours\" : 6,\r\n  \"BaseLocation\" : \"United Kingdom\"\r\n}", Event.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default EventsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update an existing event", nickname = "updateEvent", notes = "", response = Event.class, tags={ "Event Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 404, message = "Page not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/events",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    default ResponseEntity<Event> updateEvent(@ApiParam(value = "Event that needs to be added" ,required=true )  @Valid @RequestBody Event body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"Status\" : \"Status\",\r\n  \"VenueAddress\" : \"VenueAddress\",\r\n  \"EventDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"TotalVolunteers\" : 0,\r\n  \"BeneficiaryName\" : \"BeneficiaryName\",\r\n  \"TotalTravelHours\" : 1,\r\n  \"CouncilName\" : \"CouncilName\",\r\n  \"EventName\" : \"EventName\",\r\n  \"Month\" : \"January\",\r\n  \"BusinessUnit\" : \"BusinessUnit\",\r\n  \"EventId\" : \"EventId\",\r\n  \"TotalVolunteerHours\" : 6,\r\n  \"BaseLocation\" : \"United Kingdom\"\r\n}", Event.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default EventsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
