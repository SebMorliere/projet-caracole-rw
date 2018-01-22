package com.SCP.caracole.repository;

import com.SCP.caracole.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
