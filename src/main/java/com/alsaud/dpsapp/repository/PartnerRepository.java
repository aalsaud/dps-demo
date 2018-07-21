package com.alsaud.dpsapp.repository;

import com.alsaud.dpsapp.domain.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author aalsaud
 * @since 21/07/2018
 */

public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
