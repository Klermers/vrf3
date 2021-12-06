package com.example.vrf3.Logic;

import com.example.vrf3.Dto.ImageDto;
import com.example.vrf3.Logic.interfaces.IIMageLogic;
import com.example.vrf3.Repositoy.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ImageLogic implements IIMageLogic {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public ResponseEntity<HttpStatus> save(ImageDto imageDto) {

        return null;
    }
}
