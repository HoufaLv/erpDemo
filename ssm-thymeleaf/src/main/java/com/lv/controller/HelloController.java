package com.lv.controller;

import com.lv.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by houfalv on 2018/7/19.
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    /*@RequestMapping(value = "/home.do",method = RequestMethod.GET)
    public String home(){
        System.out.println("hhe");
        return "jsp/abc";
    }

    @RequestMapping(value = "/home1.do",method = RequestMethod.GET)
    public String home1(){
        System.out.println("hhe");
        //请求html/account路径下的 abc.html页面
        return "html/account/abc";
    }

    @RequestMapping(value = "/info.do",method = RequestMethod.POST)
    @ResponseBody
    public Object getPersonInfo(Person person){
        System.out.println(person.toString());
        return person.toString();
    }

    @RequestMapping(value = "/upload/id:\\d+",method = RequestMethod.GET)
    public String fileUpload(@PathVariable Integer id,@PathVariable String name){
        System.out.println("上传");
        //请求html/account路径下的 abc.html页面
        return "html/account/upload";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String fileUpload(File file){
        System.out.println("上传");
        //请求html/account路径下的 abc.html页面
        return "html/account/upload";
    }*/



    /**
     * @PathVariable 的用法
     * @param parentId
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String home(@RequestParam(name = "id") String parentId,
                       Model model){
        System.out.println(parentId);

        model.addAttribute("name","lili");

        return "html/account/abc";
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String home(Person person,
                       Model model){

        System.out.println(person.toString());
        model.addAttribute("person",person);

        return "html/account/show";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String fileUpload(){
        return "html/account/upload";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {

        if (file.isEmpty()) {
            return "未选择文件!";
        }

        File dir = new File("E:/upload");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        File uploadFile = new File(dir,file.getOriginalFilename());
        file.transferTo(uploadFile);

        return "success!";
    }

    @RequestMapping(value = "/upload2",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String fileUpload(MultipartFile file) throws IOException {

        File dir = new File("E:/img");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        File destFile = new File(dir, new Date().getTime() + file.getOriginalFilename());
        file.transferTo(destFile);

        return "上传成功!";
    }

}
