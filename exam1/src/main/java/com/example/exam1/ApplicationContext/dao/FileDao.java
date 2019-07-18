package com.example.exam1.ApplicationContext.dao;

import com.example.exam1.ApplicationContext.bean.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public class FileDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void Save(File file)
    {
        jdbcTemplate.update("insert into message(film_id,title,description,release_year,language_id,original_language_id,rental_duration,rental_rate,length,replacement_cost,rating,special_features,last_update) values(?)", file.getFilm_id(),file.getTitle(),file.getDescription(),file.getRelease_year(),file.getLanguage_id(),file.getRiginal_language_id(),file.getRental_duration(),file.getRental_rate(),file.getLength(),file.getReplacement_cost(),file.getRating(),file.getSpecial_features(),file.getLast_update());
    }
}
