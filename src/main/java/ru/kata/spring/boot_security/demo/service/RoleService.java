package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import java.util.List;

public interface RoleService {

    List<Role> findAll();

    List<Role> findAllById(List<Long> ids);

    void save(Role role);

    long count();
    List<Role> getRoles();
}
