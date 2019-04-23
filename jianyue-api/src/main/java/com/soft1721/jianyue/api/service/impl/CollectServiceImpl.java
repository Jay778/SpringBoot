package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.Collect;
import com.soft1721.jianyue.api.entity.vo.CollectVO;
import com.soft1721.jianyue.api.mapper.CollectMapper;
import com.soft1721.jianyue.api.mapper.ImgMapper;
import com.soft1721.jianyue.api.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {
    @Resource
    private CollectMapper collectMapper;
    @Resource
    private ImgMapper imgMapper;
    @Override
    public Collect getCollect(int myUId, int toId){
        return collectMapper.getCollect(myUId,toId);
    }

    @Override
    public void insertCollect(Collect collect){
        collectMapper.insertCollect(collect);
    }
    @Override
    public void deleteCollect(int myUId,int toId){
       collectMapper.deleteCollect(myUId, toId);
    }
    @Override
    public List<CollectVO> getCollectByUId(int myUId){
      List<CollectVO> collects=collectMapper.getCollectByUId(myUId);
      for (CollectVO collectVO:collects){
          collectVO.setImgs(imgMapper.selectImgsByAId(collectVO.getToId()));
      }
      return collects;
    }
}
