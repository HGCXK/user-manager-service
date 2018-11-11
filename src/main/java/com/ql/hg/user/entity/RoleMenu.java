package com.ql.hg.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author HG
 * @since 2018-11-11
 */
@TableName("tbl_sys_role_menu")
public class RoleMenu extends Model<RoleMenu> {

    private static final long serialVersionUID = 1L;

    private String roleId;

    private String menuId;

    private String menuName;

    private String parentNemuId;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentNemuId() {
        return parentNemuId;
    }

    public void setParentNemuId(String parentNemuId) {
        this.parentNemuId = parentNemuId;
    }

    public static final String ROLE_ID = "role_id";

    public static final String MENU_ID = "menu_id";

    public static final String MENU_NAME = "menu_name";

    public static final String PARENT_NEMU_ID = "parent_nemu_id";

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
        "roleId=" + roleId +
        ", menuId=" + menuId +
        ", menuName=" + menuName +
        ", parentNemuId=" + parentNemuId +
        "}";
    }
}
