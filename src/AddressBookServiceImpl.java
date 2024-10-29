package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.AddressBook;
import com.ruoyi.system.mapper.AddressBookMapper;
import com.ruoyi.system.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {

    @Autowired
    private AddressBookMapper addressBookMapper;

    @Override
    public List<AddressBook> selectAddressBookList(AddressBook addressBook) {
        return addressBookMapper.selectAddressBookList(addressBook);
    }

    @Override
    public AddressBook selectAddressBookById(Long id) {
        return addressBookMapper.selectAddressBookById(id);
    }

    @Override
    public int insertAddressBook(AddressBook addressBook) {
        return addressBookMapper.insertAddressBook(addressBook);
    }

    @Override
    public int updateAddressBook(AddressBook addressBook) {
        return addressBookMapper.updateAddressBook(addressBook);
    }

    @Override
    public int deleteAddressBookById(Long id) {
        return addressBookMapper.deleteAddressBookById(id);
    }
}
