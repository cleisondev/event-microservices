package com.cleisonnunes.events_microservice.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
}
