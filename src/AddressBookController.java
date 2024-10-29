package com.ruoyi.system.controller;

import com.ruoyi.system.domain.AddressBook;
import com.ruoyi.system.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    // 查询联系人列表
    @GetMapping("/list")
    public Map<String, Object> list(AddressBook addressBook) {
        List<AddressBook> list = addressBookService.selectAddressBookList(addressBook);
        // 使用 Map 封装结果
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("data", list);
        return response;
    }

    // 根据 ID 查询联系人
    @GetMapping("/{id}")
    public Map<String, Object> getInfo(@PathVariable Long id) {
        AddressBook addressBook = addressBookService.selectAddressBookById(id);
        Map<String, Object> response = new HashMap<>();
        if (addressBook != null) {
            response.put("status", "success");
            response.put("data", addressBook);
        } else {
            response.put("status", "error");
            response.put("message", "联系人未找到");
        }
        return response;
    }

    // 新增联系人
    @PostMapping
    public Map<String, Object> add(@RequestBody AddressBook addressBook) {
        int result = addressBookService.insertAddressBook(addressBook);
        Map<String, Object> response = new HashMap<>();
        if (result > 0) {
            response.put("status", "success");
            response.put("message", "联系人添加成功");
        } else {
            response.put("status", "error");
            response.put("message", "添加联系人失败");
        }
        return response;
    }

    // 更新联系人
    @PutMapping
    public Map<String, Object> edit(@RequestBody AddressBook addressBook) {
        int result = addressBookService.updateAddressBook(addressBook);
        Map<String, Object> response = new HashMap<>();
        if (result > 0) {
            response.put("status", "success");
            response.put("message", "联系人更新成功");
        } else {
            response.put("status", "error");
            response.put("message", "更新联系人失败");
        }
        return response;
    }

    // 删除联系人
    @DeleteMapping("/{id}")
    public Map<String, Object> remove(@PathVariable Long id) {
        int result = addressBookService.deleteAddressBookById(id);
        Map<String, Object> response = new HashMap<>();
        if (result > 0) {
            response.put("status", "success");
            response.put("message", "联系人删除成功");
        } else {
            response.put("status", "error");
            response.put("message", "删除联系人失败");
        }
        return response;
    }
}
