package com.entity.model;

import com.entity.ShangpintousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品投诉
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangpintousuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 投诉商品
     */
    private Integer shangpinId;


    /**
     * 投诉用户
     */
    private Integer yonghuId;


    /**
     * 投诉类型
     */
    private Integer shangpintousuTypes;


    /**
     * 投诉内容
     */
    private String minsuText;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：投诉商品
	 */
    public Integer getShangpinId() {
        return shangpinId;
    }


    /**
	 * 设置：投诉商品
	 */
    public void setShangpinId(Integer shangpinId) {
        this.shangpinId = shangpinId;
    }
    /**
	 * 获取：投诉用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：投诉用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：投诉类型
	 */
    public Integer getShangpintousuTypes() {
        return shangpintousuTypes;
    }


    /**
	 * 设置：投诉类型
	 */
    public void setShangpintousuTypes(Integer shangpintousuTypes) {
        this.shangpintousuTypes = shangpintousuTypes;
    }
    /**
	 * 获取：投诉内容
	 */
    public String getMinsuText() {
        return minsuText;
    }


    /**
	 * 设置：投诉内容
	 */
    public void setMinsuText(String minsuText) {
        this.minsuText = minsuText;
    }
    /**
	 * 获取：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：投诉时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
