package com.antimiApp.data.repositories;

import com.antimiApp.data.models.SpendingLimit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SpendingLimitRepository extends MongoRepository<SpendingLimit, String> {

    List<SpendingLimit> findByTeenProfileId(String teenProfileId);

}
