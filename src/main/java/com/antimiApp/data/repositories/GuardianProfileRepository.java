package com.antimiApp.data.repositories;

import com.antimiApp.data.models.GuardianProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GuardianProfileRepository extends MongoRepository<GuardianProfile, String> {

    Optional<GuardianProfile> findByUserId(String userId);

}
