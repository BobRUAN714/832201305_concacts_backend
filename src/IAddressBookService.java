package com.ruoyi.system.service;

import com.ruoyi.system.domain.AddressBook;
import java.util.List;

public interface IAddressBookService {
    List<AddressBook> selectAddressBookList(AddressBook addressBook);
    AddressBook selectAddressBookById(Long id);
    int insertAddressBook(AddressBook addressBook);
    int updateAddressBook(AddressBook addressBook);
    int deleteAddressBookById(Long id);
}
