package com.entity.vo;

import com.entity.GonglveEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 自驾游攻略
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-02
 */
@TableName("gonglve")
public class GonglveVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
