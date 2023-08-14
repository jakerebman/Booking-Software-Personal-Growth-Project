package com.bookingsoftware.controller.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingCreateRequest {

    @JsonProperty("Activity_Id")
    private String activityID;

    @JsonProperty("Activity_Name")
    private String activityName;

    @JsonProperty("Activity_Duration")
    private String activityDuration;

    @JsonProperty("Activity_Date")
    private String activityDate;

    @JsonProperty("Activity_Price")
    private String price;

    @JsonProperty("Activity_Description")
    private String description;

    @JsonProperty("Customer_Name")
    private String customer;

    @JsonProperty("CustomerPhoneNumber")
    private String phoneNumber;

}
