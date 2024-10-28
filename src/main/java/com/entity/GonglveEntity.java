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
 * 自驾游攻略
 *
 * @author 
 * @email
 * @date 2021-04-02
 */
@TableName("gonglve")
public class GonglveEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GonglveEntity() {

	}

	public GonglveEntity(T t) {
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
     * 攻略名
     */
    @TableField(value = "gonglve_name")

    private String gonglveName;


    /**
     * 攻略类型
     */
    @TableField(value = "gonglve_types")

    private Integer gonglveTypes;


    /**
     * 攻略照片
     */
    @TableField(value = "gonglve_photo")

    private String gonglvePhoto;


    /**
     * 攻略详情
     */
    @TableField(value = "gonglve_content")

    private String gonglveContent;


    /**
     * 攻略发表时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
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
	 * 设置：攻略名
	 */
    public String getGonglveName() {
        return gonglveName;
    }


    /**
	 * 获取：攻略名
	 */

    public void setGonglveName(String gonglveName) {
        this.gonglveName = gonglveName;
    }
    /**
	 * 设置：攻略类型
	 */
    public Integer getGonglveTypes() {
        return gonglveTypes;
    }


    /**
	 * 获取：攻略类型
	 */

    public void setGonglveTypes(Integer gonglveTypes) {
        this.gonglveTypes = gonglveTypes;
    }
    /**
	 * 设置：攻略照片
	 */
    public String getGonglvePhoto() {
        return gonglvePhoto;
    }


    /**
	 * 获取：攻略照片
	 */

    public void setGonglvePhoto(String gonglvePhoto) {
        this.gonglvePhoto = gonglvePhoto;
    }
    /**
	 * 设置：攻略详情
	 */
    public String getGonglveContent() {
        return gonglveContent;
    }


    /**
	 * 获取：攻略详情
	 */

    public void setGonglveContent(String gonglveContent) {
        this.gonglveContent = gonglveContent;
    }
    /**
	 * 设置：攻略发表时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：攻略发表时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gonglve{" +
            "id=" + id +
            ", gonglveName=" + gonglveName +
            ", gonglveTypes=" + gonglveTypes +
            ", gonglvePhoto=" + gonglvePhoto +
            ", gonglveContent=" + gonglveContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
