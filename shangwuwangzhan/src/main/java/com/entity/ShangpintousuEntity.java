package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品投诉
 *
 * @author 
 * @email
 */
@TableName("shangpintousu")
public class ShangpintousuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangpintousuEntity() {

	}

	public ShangpintousuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 投诉商品
     */
    @TableField(value = "shangpin_id")

    private Integer shangpinId;


    /**
     * 投诉用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 投诉类型
     */
    @TableField(value = "shangpintousu_types")

    private Integer shangpintousuTypes;


    /**
     * 投诉内容
     */
    @TableField(value = "minsu_text")

    private String minsuText;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：投诉商品
	 */
    public Integer getShangpinId() {
        return shangpinId;
    }


    /**
	 * 获取：投诉商品
	 */

    public void setShangpinId(Integer shangpinId) {
        this.shangpinId = shangpinId;
    }
    /**
	 * 设置：投诉用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：投诉用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：投诉类型
	 */
    public Integer getShangpintousuTypes() {
        return shangpintousuTypes;
    }


    /**
	 * 获取：投诉类型
	 */

    public void setShangpintousuTypes(Integer shangpintousuTypes) {
        this.shangpintousuTypes = shangpintousuTypes;
    }
    /**
	 * 设置：投诉内容
	 */
    public String getMinsuText() {
        return minsuText;
    }


    /**
	 * 获取：投诉内容
	 */

    public void setMinsuText(String minsuText) {
        this.minsuText = minsuText;
    }
    /**
	 * 设置：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：投诉时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shangpintousu{" +
            "id=" + id +
            ", shangpinId=" + shangpinId +
            ", yonghuId=" + yonghuId +
            ", shangpintousuTypes=" + shangpintousuTypes +
            ", minsuText=" + minsuText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
