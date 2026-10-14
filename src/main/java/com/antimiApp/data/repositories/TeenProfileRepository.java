package com.antimiApp.data.repositories;

import com.antimiApp.data.models.TeenProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TeenProfileRepository extends MongoRepository<TeenProfile, String> {

    Optional<TeenProfile> findByUserId(String userId);

}
