package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.CategorieDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public interface ICategorieLogic {
    ResponseEntity<Set<CategorieDto>> GetallCatergories();

    ResponseEntity<HttpStatus> save(CategorieDto categorieDto);
}
