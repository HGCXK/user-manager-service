package com.ql.hg.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author HG
 * @since 2018-11-12
 */
@TableName("tbl_sys_menu")
@Data
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 是否有效 0无效 1 有效
     */
    private Boolean flag;

    /**
     * 图标
     */
    private String icon;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 名称
     */
    private String name;

    /**
     * 父亲标题
     */
    private String parentId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 访问地址
     */
    private String url;

    /**
     * 是否有孩子节点 1是 0否
     */
    private Integer hasChild;


    public static final String ID = "id";

    public static final String FLAG = "flag";

    public static final String ICON = "icon";

    public static final String LEVEL = "level";

    public static final String NAME = "name";

    public static final String PARENT_ID = "parent_id";

    public static final String SORT = "sort";

    public static final String URL = "url";

    public static final String HAS_CHILD = "has_child";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Menu{" +
        "id=" + id +
        ", flag=" + flag +
        ", icon=" + icon +
        ", level=" + level +
        ", name=" + name +
        ", parentId=" + parentId +
        ", sort=" + sort +
        ", url=" + url +
        ", hasChild=" + hasChild +
        "}";
    }
}
