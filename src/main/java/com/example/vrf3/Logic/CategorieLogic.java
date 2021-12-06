package com.example.vrf3.Logic;

import com.example.vrf3.Dto.CategorieDto;
import com.example.vrf3.Logic.interfaces.ICategorieLogic;
import com.example.vrf3.Mapstruct.MapStructMapperImpl;
import com.example.vrf3.Repositoy.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategorieLogic implements ICategorieLogic {

    @Autowired
    private CategorieRepository categorieRepository;

    @Autowired
    private MapStructMapperImpl mapStructMapper;

    @Override
    public ResponseEntity<Set<CategorieDto>> GetallCatergories() {
        Set<CategorieDto> categorieDtos = new HashSet<>();
        try {
            categorieDtos = mapStructMapper.CategoriesDataToCategorieDtos(categorieRepository.findAll());
        }catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(categorieDtos,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> save(CategorieDto categorieDto) {
        try {
            categorieRepository.save(mapStructMapper.CategorieDtoToCategoriesData(categorieDto));
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
