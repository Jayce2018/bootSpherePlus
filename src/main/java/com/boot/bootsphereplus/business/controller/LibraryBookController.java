package com.boot.bootsphereplus.business.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.boot.bootsphereplus.business.entity.LibraryBook;
import com.boot.bootsphereplus.business.service.LibraryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jayce
 * @since 2020-11-26
 */
@RestController
@RequestMapping("/libraryBook")
public class LibraryBookController {
    @Autowired
    private LibraryBookService libraryBookService;

    @RequestMapping(value = "/plus")
    public List<LibraryBook> method() {
        Wrapper<LibraryBook> wrapper=new EntityWrapper<>();
        wrapper.eq("status", 2);
        wrapper.eq("book_name","demoData");
        List<LibraryBook> libraryBooks = libraryBookService.selectList(null);
        return libraryBooks;
    }

    @RequestMapping(value = "/insert")
    public String temp() {
        LibraryBook libraryBook = new LibraryBook();
        libraryBook.setBookName("哈姆雷特");
        libraryBook.setStatus(2);
        libraryBook.setCreateTime(new Date());
        boolean flag = libraryBookService.insert(libraryBook);
        return String.valueOf(flag);
    }


}

