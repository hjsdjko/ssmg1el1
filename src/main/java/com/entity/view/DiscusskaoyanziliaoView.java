package com.entity.view;

import com.entity.DiscusskaoyanziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考研资料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
@TableName("discusskaoyanziliao")
public class DiscusskaoyanziliaoView  extends DiscusskaoyanziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskaoyanziliaoView(){
	}
 
 	public DiscusskaoyanziliaoView(DiscusskaoyanziliaoEntity discusskaoyanziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusskaoyanziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
