package com.linkedin.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface of the CRUD operations for the Room Entity all handled by the
 * Spring
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
