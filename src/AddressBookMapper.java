package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.AddressBook;
import java.util.List;

public interface AddressBookMapper {

    // 查询所有联系人
    List<AddressBook> selectAddressBookList(AddressBook addressBook);

    // 根据ID查询联系人
    AddressBook selectAddressBookById(Long id);

    // 新增联系人
    int insertAddressBook(AddressBook addressBook);

    // 更新联系人
    int updateAddressBook(AddressBook addressBook);

    // 删除联系人
    int deleteAddressBookById(Long id);
}
