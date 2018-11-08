package com.ql.hg.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.util.List;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author HG
 * @since 2018-11-08
 */
@TableName("tbl_sys_role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String createdAccount;

    private LocalDateTime createdDate;

    private String description;

    private String locationCode;

    private String name;
    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAccount() {
        return createdAccount;
    }

    public void setCreatedAccount(String createdAccount) {
        this.createdAccount = createdAccount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final String ID = "id";

    public static final String CREATED_ACCOUNT = "created_account";

    public static final String CREATED_DATE = "created_date";

    public static final String DESCRIPTION = "description";

    public static final String LOCATION_CODE = "location_code";

    public static final String NAME = "name";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Role{" +
        "id=" + id +
        ", createdAccount=" + createdAccount +
        ", createdDate=" + createdDate +
        ", description=" + description +
        ", locationCode=" + locationCode +
        ", name=" + name +
        "}";
    }
}
