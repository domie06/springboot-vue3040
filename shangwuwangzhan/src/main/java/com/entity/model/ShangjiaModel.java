package com.entity.model;

import com.entity.ShangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商家
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 商家姓名
     */
    private String shangjiaName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 现有余额
     */
    private Double newMoney;


    /**
     * 身份证号
     */
    private String shangjiaIdNumber;


    /**
     * 手机号
     */
    private String shangjiaPhone;


    /**
     * 邮箱
     */
    private String shangjiaEmail;


    /**
     * 营业执照展示
     */
    private String shangjiaPhoto;


    /**
     * 商家星级
     */
    private String shangjiaXingji;


    /**
     * 商家简介
     */
    private String shangjiaContent;


    /**
     * 假删
     */
    private Integer shangjiaDelete;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：商家姓名
	 */
    public String getShangjiaName() {
        return shangjiaName;
    }


    /**
	 * 设置：商家姓名
	 */
    public void setShangjiaName(String shangjiaName) {
        this.shangjiaName = shangjiaName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：现有余额
	 */
    public Double getNewMoney() {
        return newMoney;
    }


    /**
	 * 设置：现有余额
	 */
    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
    }
    /**
	 * 获取：身份证号
	 */
    public String getShangjiaIdNumber() {
        return shangjiaIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setShangjiaIdNumber(String shangjiaIdNumber) {
        this.shangjiaIdNumber = shangjiaIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getShangjiaPhone() {
        return shangjiaPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setShangjiaPhone(String shangjiaPhone) {
        this.shangjiaPhone = shangjiaPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getShangjiaEmail() {
        return shangjiaEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setShangjiaEmail(String shangjiaEmail) {
        this.shangjiaEmail = shangjiaEmail;
    }
    /**
	 * 获取：营业执照展示
	 */
    public String getShangjiaPhoto() {
        return shangjiaPhoto;
    }


    /**
	 * 设置：营业执照展示
	 */
    public void setShangjiaPhoto(String shangjiaPhoto) {
        this.shangjiaPhoto = shangjiaPhoto;
    }
    /**
	 * 获取：商家星级
	 */
    public String getShangjiaXingji() {
        return shangjiaXingji;
    }


    /**
	 * 设置：商家星级
	 */
    public void setShangjiaXingji(String shangjiaXingji) {
        this.shangjiaXingji = shangjiaXingji;
    }
    /**
	 * 获取：商家简介
	 */
    public String getShangjiaContent() {
        return shangjiaContent;
    }


    /**
	 * 设置：商家简介
	 */
    public void setShangjiaContent(String shangjiaContent) {
        this.shangjiaContent = shangjiaContent;
    }
    /**
	 * 获取：假删
	 */
    public Integer getShangjiaDelete() {
        return shangjiaDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setShangjiaDelete(Integer shangjiaDelete) {
        this.shangjiaDelete = shangjiaDelete;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
