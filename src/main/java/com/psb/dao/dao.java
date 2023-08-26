package com.psb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psb.Entitys.Entitys;

public interface dao extends JpaRepository<Entitys, Integer> {

}
