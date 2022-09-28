package com.linkedin.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface of the CRUD operations for the Room Entity all handled by the
 * Spring
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
