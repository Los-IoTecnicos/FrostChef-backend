package com.iotecnicos.backend_iotecnicos.collaborate_and_request.interfaces.rest.resources;

import java.util.Date;

public record RestaurantResource(
        Long id,
        String name,
        String location,
        String contactInfo,
        Date createdDate,
        Long projectId
) {
}
