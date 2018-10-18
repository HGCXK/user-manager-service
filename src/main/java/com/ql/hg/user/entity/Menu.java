package com.ql.hg.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

import org.springframework.boot.autoconfigure.jmx.ParentAwareNamingStrategy;

/**
 * <p>
 * 
 * </p>
 *
 * @author HG
 * @since 2018-09-20
 */
@TableName("tbl_sys_menu")
@Accessors(chain=true)
@Data
public class Menu extends Model<Menu> {

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
    

    

	@Override
	protected Serializable pkVal() {
		return this.id;
	}


  
}
