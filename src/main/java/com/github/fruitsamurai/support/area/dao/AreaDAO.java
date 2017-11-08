package com.github.fruitsamurai.support.area.dao;

import com.github.fruitsamurai.framework.common.persistence.BaseMybatisDAO;
import com.github.fruitsamurai.support.area.entity.Area;

import java.util.List;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class AreaDAO extends BaseMybatisDAO{

    private final String MAPPER_NAMESPACE = "com.github.fruitsamurai.support.area.entity.AreaMapper";

    /**
     * 保存
     * @param area
     */
    public void save(Area area){
        super.save(MAPPER_NAMESPACE+".insertSelective",area);
    }

    /**
     * 更新
     * @param area
     */
    public void update(Area area){
        super.update(MAPPER_NAMESPACE+".updateByPrimaryKeySelective",area);
    }

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    public Area getByName(String name){
        return super.findOne(MAPPER_NAMESPACE+".selectByName",name);
    }

    /**
     * 根据父节点ID查询
     * @param parentId
     * @return
     */
    public List<Area> getByParentId(Long parentId){
        return super.findAll(MAPPER_NAMESPACE+".selectByParentId",parentId);
    }

    public static void main(String[] args) {

    }

}
