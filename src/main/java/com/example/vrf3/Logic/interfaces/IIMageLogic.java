package com.example.vrf3.Logic.interfaces;

import com.example.vrf3.Dto.ImageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IIMageLogic {
    ResponseEntity<HttpStatus> save(ImageDto imageDto);
    ResponseEntity<HttpStatus> delete(int id);
}
