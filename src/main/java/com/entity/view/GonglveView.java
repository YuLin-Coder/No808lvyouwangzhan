package com.entity.view;

import com.entity.GonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 自驾游攻略
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-02
 */
@TableName("gonglve")
public class GonglveView extends GonglveEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 攻略类型的值
		*/
		private String gonglveValue;



	public GonglveView() {

	}

	public GonglveView(GonglveEntity gonglveEntity) {
		try {
			BeanUtils.copyProperties(this, gonglveEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 攻略类型的值
			*/
			public String getGonglveValue() {
				return gonglveValue;
			}
			/**
			* 设置： 攻略类型的值
			*/
			public void setGonglveValue(String gonglveValue) {
				this.gonglveValue = gonglveValue;
			}














}
