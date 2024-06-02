package com.bloodDonationMgmtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodDonationMgmtSystem.model.DonarDetails;

@Repository
public interface DonarDetailsRepository extends JpaRepository<DonarDetails, Long> {


}
