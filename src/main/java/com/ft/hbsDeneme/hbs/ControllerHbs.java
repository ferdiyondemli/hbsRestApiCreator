package com.ft.hbsDeneme.hbs;

import com.ft.restApiCreator.filecreator.fileComponent.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/hbs")
@RequiredArgsConstructor
public class ControllerHbs {

    private final HbsFileCreator hbsFileCreator;

    @PostMapping("/createfiles")
    public String createhbs(@RequestBody JavaFile javaFile) {

        String path = System.getProperty("user.dir");
        hbsFileCreator.createFile(javaFile,  "C:\\Users\\user\\Desktop\\hbsRestApiCreator\\src\\main\\java\\com\\ft\\hbsDeneme");
        return "Ok. I've created them'll ";
    }


    @GetMapping("/test")
    public String getll() {

        return "Ok. tits'r teasin";
    }

}
