package com.antimiApp.data.repositories;

import com.antimiApp.data.models.ApprovalRequest;
import com.antimiApp.data.models.ApprovalStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ApprovalRequestRepository extends MongoRepository<ApprovalRequest, String> {

    List<ApprovalRequest> findByTeenProfileId(String teenProfileId);

    List<ApprovalRequest> findByGuardianProfileIdAndStatus(
            String guardianProfileId,
            ApprovalStatus status
    );
}
