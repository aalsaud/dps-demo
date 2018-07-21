package com.alsaud.dpsapp.service.dto;

import com.alsaud.dpsapp.domain.Deal;

import java.math.BigDecimal;

/**
 * @author aalsaud
 * @since 21/07/2018
 */
public class DealDto {
    private long id;
    private String category;
    private String partner;
    private BigDecimal price;

    /** Mapping **/
    public static DealDto toDto(Deal entity){
        DealDto dto = new DealDto();
        dto.setId(entity.getId());
        dto.setCategory(entity.getCategory());
//        dto.setPartner(entity.getPartner());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    public static Deal toEntity(DealDto dto){
        Deal entity = new Deal();
        entity.setId(dto.getId());
        entity.setCategory(dto.getCategory());
//        entity.setPartner(dto.getPartner());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    /** Getters, Sitters **/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
