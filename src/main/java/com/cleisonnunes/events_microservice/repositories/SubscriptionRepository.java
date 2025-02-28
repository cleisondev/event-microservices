package com.cleisonnunes.events_microservice.repositories;

import com.cleisonnunes.events_microservice.Domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}