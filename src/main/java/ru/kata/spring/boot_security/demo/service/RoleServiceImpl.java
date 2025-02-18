package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepo;

import java.util.List;

@Service
public class RoleServiceImpl implements  RoleService {

    private final RoleRepo roleRepo;

    public RoleServiceImpl(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    @Transactional
    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    @Override
    @Transactional
    public List<Role> findAllById(List<Long> ids) {
        return roleRepo.findAllById(ids);
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleRepo.save(role);
    }

    @Override
    public long count() {
        return roleRepo.count();
    }
}