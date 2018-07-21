package com.alsaud.dpsapp.web.rest;

import com.alsaud.dpsapp.service.DealService;
import com.alsaud.dpsapp.service.dto.DealDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author aalsaud
 * @since 21/07/2018
 */

@RestController
@RequestMapping("api/v1/deal/")
public class DealResource {

    @Autowired
    DealService dealService;

    @PostMapping()
    public ResponseEntity<DealDto> createDeal(@RequestBody @Valid DealDto dealDto){
        return ResponseEntity.ok(dealService.createDeal(dealDto));
    }
    @GetMapping("{id}")
    public ResponseEntity<DealDto> retrieveDeal(@PathVariable Long id){
        return ResponseEntity.ok(dealService.findDeal(id));
    }
    @PutMapping("{id}")
    public ResponseEntity<DealDto> updateDeal(@RequestBody @Valid DealDto dealDto){
        return ResponseEntity.ok(dealService.updateDeal(dealDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteDeal(@PathVariable Long id){
        return ResponseEntity.ok(dealService.deleteDeal(id));
    }
    @GetMapping("all")
    public ResponseEntity<List<DealDto>> listDeals() {
        return ResponseEntity.ok().body(null);
    }
}
