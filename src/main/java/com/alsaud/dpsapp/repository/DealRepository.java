package com.alsaud.dpsapp.repository;

import com.alsaud.dpsapp.domain.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author aalsaud
 * @since 21/07/2018
 */

public interface DealRepository extends JpaRepository<Deal, Long> {

}
