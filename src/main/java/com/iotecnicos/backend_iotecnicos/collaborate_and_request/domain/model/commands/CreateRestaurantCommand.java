package com.iotecnicos.backend_iotecnicos.collaborate_and_request.domain.model.commands;

import java.util.Date;

public record CreateRestaurantCommand(String Name, String location, String contactInfo, Date createdDate) {
}
