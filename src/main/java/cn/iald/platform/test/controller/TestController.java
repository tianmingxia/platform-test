package cn.iald.platform.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 短链接映射表Controller
 *
 * @author wangyc
 * @version 2020年12月29日 13:29:00 初始创建
 */
@Slf4j
@RestController
@RequestMapping("/memberUserPay")
public class TestController {


    @PostMapping("/Alipay")
    public String aliPay(HttpServletRequest request){
        String reqString;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            StringBuffer req = new StringBuffer();
            String line = "";
            while ((line = br.readLine()) != null) {
                req.append(line);
            }
            reqString = req.toString();
            log.info("支付宝回调传递信息：" + reqString);
        }catch (Exception e){
            e.getMessage();
        }
        return "SUCCESS";
    }


}
