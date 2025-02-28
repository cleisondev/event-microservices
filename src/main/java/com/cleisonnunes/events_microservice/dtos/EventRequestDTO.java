package com.cleisonnunes.events_microservice.dtos;

public record EventRequestDTO(int maxParticipants, int registeredParticipants, String date, String title, String description) {
}
