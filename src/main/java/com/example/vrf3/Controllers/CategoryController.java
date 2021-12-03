package com.example.vrf3.Controllers;

import com.example.vrf3.Dto.CategorieDto;
import com.example.vrf3.Logic.interfaces.ICategorieLogic;
import com.example.vrf3.Logic.interfaces.IWorldLogic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(path="/category")
public class CategoryController {

    private final ICategorieLogic categorieLogic;

    public CategoryController(ICategorieLogic categorieLogic) {
        this.categorieLogic = categorieLogic;
    }

    @GetMapping(path = "/categories")
    public @ResponseBody
    ResponseEntity Categories() {
        return categorieLogic.GetallCatergories();
    }
}
