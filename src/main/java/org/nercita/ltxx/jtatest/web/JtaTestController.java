package org.nercita.ltxx.jtatest.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nercita.ltxx.jtatest.service.JtaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Controller
public class JtaTestController {     
    @Autowired
    private JtaTestService jtaTestService;
    //MySQL的数据库引擎必须是InnoDB，否则无法回滚  
    @Test  
    public void test(){  
        jtaTestService.test();  
    }  
    @Test
    public void test2(){  
        jtaTestService.update();  
    }  
  
    @Test  
    public void test3(){  
        jtaTestService.test3();  
    }  
}  