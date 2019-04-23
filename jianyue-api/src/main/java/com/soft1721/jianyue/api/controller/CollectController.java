package com.soft1721.jianyue.api.controller;

import com.soft1721.jianyue.api.entity.Collect;
import com.soft1721.jianyue.api.entity.vo.CollectVO;
import com.soft1721.jianyue.api.service.CollectService;
import com.soft1721.jianyue.api.util.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/collect")
public class CollectController {
    @Resource
    private CollectService collectService;

    @PostMapping("/add")
    public ResponseResult collectUser(@RequestParam("myUId") int myUId,@RequestParam("toId") int toId){
        Collect collect=new Collect();
        collect.setMyUId(myUId);
        collect.setToId(toId);
        collectService.insertCollect(collect);
        return ResponseResult.success();
    }

    @PostMapping("/cancel")
    public ResponseResult cancelCollect(@RequestParam("myUId") int myUId,@RequestParam("toId") int toId){
        collectService.deleteCollect(myUId,toId);
        return ResponseResult.success();
    }

    @GetMapping("/list")
    public ResponseResult getCollectByUId(@RequestParam("myUId") int myUId){
        List<CollectVO> collectVOList=collectService.getCollectByUId(myUId);
        return ResponseResult.success(collectVOList);
    }
}
