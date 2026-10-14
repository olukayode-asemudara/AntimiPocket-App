package com.antimiApp.data.repositories;

import com.antimiApp.data.models.GoalStatus;
import com.antimiApp.data.models.SavingsGoal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SavingsGoalRepository extends MongoRepository<SavingsGoal, String> {

    List<SavingsGoal> findByTeenProfileId(String teenProfileId);

    List<SavingsGoal> findByTeenProfileIdAndStatus(
            String teenProfileId,
            GoalStatus status
    );
}
