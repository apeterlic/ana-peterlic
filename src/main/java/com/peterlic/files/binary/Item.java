package com.peterlic.files.binary;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Class that represents <code>Item</code>.
 * Implements <code>Serializable</code> interface (for serialization and deserialization)
 *
 * @author Ana Peterlic
 * @see java.io.Serializable
 * @since 09/03/2022
 */
class Item implements Serializable {

    private String code;
    private String name;
    private BigDecimal price;

    public Item(String code, String name, BigDecimal price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Returns <code>String</code> representation of an object
     */
    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
