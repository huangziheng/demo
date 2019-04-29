package com.example.demo.business.controller;

import com.example.demo.business.dto.BusinessDto;
import com.example.demo.business.mapper.BusinessMapper;
import com.example.demo.business.model.User;
import com.example.demo.business.service.BusinessService;
import com.example.demo.core.dto.DataResult;
import com.example.demo.core.util.RedisUtils;
import com.example.demo.core.util.StringRedisUtil;
import com.example.demo.exception.BusinessException;
import com.example.demo.exception.ServiceException;
import com.example.demo.rabbitmq.RabbitProducer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/18 0018.
 */
@RestController
//@RequestMapping("/business")
@Api(tags="商务的API",description ="App相关操作接口定义类")
public class BusinessController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${gwf.name}")
    private String msg;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private StringRedisUtil stringRedisUtil;
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private RabbitProducer rabbitProducer;

    @Autowired
    private BusinessMapper businessMapper;

    @ApiOperation(value = "查询所有商务信息")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Object findAll(){
        return new DataResult(businessMapper.findAll());
    }

    @ApiOperation(value = "新增 商务信息")
    @RequestMapping(value = "/insertBusiness",method = RequestMethod.POST)
    public Object insertBusiness(@RequestBody BusinessDto businessDto){
        businessService.insertBusiness(businessDto);
        return new DataResult<>("新增数据成功");
    }

    @ApiOperation(value = "测试通用Mapper")
    @RequestMapping(value = "/testMapper",method = RequestMethod.POST)
    public Object testMapper(@RequestBody BusinessDto businessDto){
        Object o = businessService.testMapper(businessDto);
        return new DataResult<>(o);
    }

    @ApiOperation(value = "测试分页结果")
    @RequestMapping(value = "/findItemByPage",method = RequestMethod.POST)
    public Object findItemByPage(@RequestBody BusinessDto businessDto){
        //Object o = businessService.findItemByPage(businessDto.getCurrentPage(),businessDto.getPageSize());
        return new DataResult<>(null);
    }

    @ApiOperation(value = "测试全局异常和自定义异常")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
//        int num = 1/0;
        logger.info("22222222222222222");
//        return this.msg;
        throw new ServiceException("100","密码错误");


    }

    @ApiOperation(value = "测试redis储存和拿取")
    @RequestMapping(value = "/selectRedis",method = RequestMethod.GET)
    public Object selectRedis(){
        User user=new User();
        user.setName("黄梓恒");
        user.setPassword("11111111111111111");
        Object peng = null;
        Object ziheng = null;
        try {
            //peng = stringRedisUtil.set("longf", "1傻子");

            peng = redisUtils.put("ziheng", user);
            ziheng = redisUtils.get("ziheng");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ziheng;
    }
    @ApiOperation(value = "rabbitmq")
    @RequestMapping(value = "/testStringSend",method = RequestMethod.GET)
    public void testStringSend(){
        for(int i=0;i<10;i++){
            rabbitProducer.stringSend();
        }
    }
}
