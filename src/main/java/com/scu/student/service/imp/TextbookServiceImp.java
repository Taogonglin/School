package com.scu.student.service.imp;


import com.scu.student.dao.TextbookDao;
import com.scu.student.entity.Textbook;
import com.scu.student.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TextbookServiceImp implements TextbookService {
    @Autowired
    private TextbookDao textbookdao;

    @Override
    public Textbook getTextbookById(String id) {
        return textbookdao.getTextbookById(id);
    }
}
