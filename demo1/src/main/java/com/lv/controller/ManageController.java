package com.lv.controller;

import com.lv.config.BaseController;
import com.lv.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 综合管理系统业务控制器
 */
@Controller
@RequestMapping("/manage")
public class ManageController extends BaseController {

    /**
     * 综合管理系统登陆
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String manageLogin() {
        return "manage/login";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public String manageLogin(@RequestParam String accountMobile,@RequestParam String accountPasswords) {

        System.out.println(accountMobile);
        System.out.println(accountPasswords);

        //Account [Hash = 413291854, id=null, accountName=null, accountMobile=1123, accountPassword=123, accountCreateTime=null, accountUpdateTime=null, accountState=null, serialVersionUID=1]
        return buildSuccessResultInfo("登陆成功");
    }

}
