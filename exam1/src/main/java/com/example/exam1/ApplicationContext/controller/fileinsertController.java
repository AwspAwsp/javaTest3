package com.example.exam1.ApplicationContext.controller;

import com.example.exam1.ApplicationContext.bean.File;
import com.example.exam1.ApplicationContext.service.FileServempl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class fileinsertController {
  @Autowired
   private FileServempl fileServempl;
    @RequestMapping("/success")
public String success(int film_id, String title, String description, int release_year, int  language_id, int  riginal_language_id, int  rental_duration, double rental_rate, int length, double replacement_cost, String rating, String special_features, Date last_update)
{
    File file=new File( film_id, title,description,release_year,language_id, riginal_language_id,  rental_duration, rental_rate, length,  replacement_cost,  rating,  special_features, last_update);
      fileServempl.save(file);
    return "insert success!";
}
}
