package com.crdjpa.service;

import com.crdjpa.model.Page;
import com.crdjpa.repository.PageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService 
{
    @Autowired
    PageRepository pageRepository;

    public void saveOrUpdate(Page page) 
{
    pageRepository.save(page);
}
}
