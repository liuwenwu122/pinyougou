package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<TbBrand>{

    /**
     * 查询所有商品列表
     * @return List<TbBrand>
     */
    List<TbBrand> queryAll();

}
