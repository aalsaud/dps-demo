package com.alsaud.dpsapp.service;

import com.alsaud.dpsapp.domain.Deal;
import com.alsaud.dpsapp.repository.DealRepository;
import com.alsaud.dpsapp.service.dto.DealDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aalsaud
 * @since 21/07/2018
 */
@Service
public class DealService {

    @Autowired
    private DealRepository dealRepository;

    public DealDto createDeal(DealDto dealDto) {
        return DealDto.toDto(dealRepository.save(DealDto.toEntity(dealDto)));
    }

    public DealDto findDeal(long dealId) {
        return DealDto.toDto(dealRepository.getOne(dealId));
    }

    public DealDto updateDeal(DealDto dealDto) {
        return DealDto.toDto(dealRepository.save(DealDto.toEntity(dealDto)));
    }

    public boolean deleteDeal(long id) {
        dealRepository.deleteById(id);
        return true;
    }

    public List<Deal> listDeals() {
        return dealRepository.findAll();
    }

}
