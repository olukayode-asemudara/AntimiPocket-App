package com.antimiApp.data.repositories;

import com.antimiApp.data.models.Pocket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PocketRepository extends MongoRepository<Pocket, String> {

    List<Pocket> findByTeenProfileId(String teenProfileId);

}
