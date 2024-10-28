package com.entity.model;

import com.entity.GonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 自驾游攻略
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-02
 */
public class GonglveModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 攻略名
     */
    private String gonglveName;


    /**
     * 攻略类型
     */
    private Integer gonglveTypes;


    /**
     * 攻略照片
     */
    private String gonglvePhoto;


    /**
     * 攻略详情
     */
    private String gonglveContent;


    /**
     * 攻略发表时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
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
	 * 获取：攻略名
	 */
    public String getGonglveName() {
        return gonglveName;
    }


    /**
	 * 设置：攻略名
	 */
    public void setGonglveName(String gonglveName) {
        this.gonglveName = gonglveName;
    }
    /**
	 * 获取：攻略类型
	 */
    public Integer getGonglveTypes() {
        return gonglveTypes;
    }


    /**
	 * 设置：攻略类型
	 */
    public void setGonglveTypes(Integer gonglveTypes) {
        this.gonglveTypes = gonglveTypes;
    }
    /**
	 * 获取：攻略照片
	 */
    public String getGonglvePhoto() {
        return gonglvePhoto;
    }


    /**
	 * 设置：攻略照片
	 */
    public void setGonglvePhoto(String gonglvePhoto) {
        this.gonglvePhoto = gonglvePhoto;
    }
    /**
	 * 获取：攻略详情
	 */
    public String getGonglveContent() {
        return gonglveContent;
    }


    /**
	 * 设置：攻略详情
	 */
    public void setGonglveContent(String gonglveContent) {
        this.gonglveContent = gonglveContent;
    }
    /**
	 * 获取：攻略发表时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：攻略发表时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
