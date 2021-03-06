package com.general.inventory.data.entity;

import com.general.base.data.entity.Auditable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 *<pre>
 *     Entity class for database table.
 *</pre>
 * @author jalal
 */

@Entity
@Table(name = "GPOS_SP_SUPPLIER")
public class Supplier extends Auditable {

    private String id;
    private String name;
    private String description;
    private String address;
    private String phoneNumber;

    @Id
    @NotNull
    @Column(name = "SP_SUP_ID", length = 10, unique = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "SP_SUP_NAME", length = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "SP_SUP_DESC", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "SP_SUP_ADDRESS", length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "SP_SUP_PHNO", length = 15)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Transient
    @Override
    public String getPrimaryKeyColumns() {
        return String.join("~~","SP_SUP_ID");
    }

    @Transient
    @Override
    public String getPrimaryKeyValues() {
        return String.join("~~",this.getId());
    }

    @Transient
    @Override
    public String getNonPrimaryKeyColumns() {
        return String.join("~~","SP_SUP_NAME","SP_SUP_DESC","SP_SUP_ADDRESS","SP_SUP_PHNO");
    }

    @Transient
    @Override
    public String getNonPrimaryKeyValues() {
        return String.join("~~",this.getName(), this.getDescription(), this.getAddress(), this.getPhoneNumber());
    }
}

