package com.alsaud.dpsapp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author aalsaud
 * @since 21/07/2018
 */

@Entity
public class Deal extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    private String category;
    private String partner;
    private BigDecimal price;

    public enum Category {
        TRAVEL, HOTEL, RENT
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String  category) {
        this.category = category;
    }

    public String  getPartner() {
        return partner;
    }

    public void setPartner(String  partner) {
        this.partner = partner;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
