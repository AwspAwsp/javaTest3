package com.example.exam1.ApplicationContext.service;

import com.example.exam1.ApplicationContext.bean.File;
import com.example.exam1.ApplicationContext.dao.FileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServempl implements FileServe {
@Autowired
  private FileDao fileDao;
    @Override
    public void save(File file) {
      fileDao.Save(file);
    }
}
