package com.bloodDonationMgmtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodDonationMgmtSystem.model.RequestorDetails;

@Repository
public interface RequestorDetailsRepository extends JpaRepository<RequestorDetails, Long> {


}
