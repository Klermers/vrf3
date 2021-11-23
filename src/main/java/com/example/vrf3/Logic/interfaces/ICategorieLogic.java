package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.CategorieDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface ICategorieLogic {
    ResponseEntity<CategorieDto> GetallCatergories();
    ResponseEntity<HttpStatus> saveCatergorie(CategorieDto categorieDto);
    ResponseEntity<HttpStatus> deleteCategorie(int id);
}
