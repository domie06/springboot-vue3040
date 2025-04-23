package com.dao;

import com.entity.ShangpintousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpintousuView;

/**
 * 商品投诉 Dao 接口
 *
 * @author 
 */
public interface ShangpintousuDao extends BaseMapper<ShangpintousuEntity> {

   List<ShangpintousuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
