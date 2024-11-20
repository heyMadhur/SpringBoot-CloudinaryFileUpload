package com.imageupload.CloudinaryFileUpload.Controller;

import com.imageupload.CloudinaryFileUpload.Cloudinary.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    CloudinaryService cloudinaryService;

    @GetMapping("/")
    public String getDefault(){
        return "Hey User";
    }

    @PostMapping("/file")
    public Map uploadfile(@RequestParam("file") MultipartFile file) throws Exception {
        System.out.println("Upload Image Request received");
        return cloudinaryService.uploadFile(file);
    }

    @DeleteMapping("/deleteFile/{publicId}")
    public Map deleteFile(@PathVariable String publicId ) {
        return cloudinaryService.deleteFile(publicId);
    }

    @PutMapping("/updateFile/{publicId}")
    public Map updateFile(@PathVariable String publicId, @RequestParam("file") MultipartFile file) throws Exception {
        cloudinaryService.deleteFile(publicId);
        return cloudinaryService.uploadFile(file);
    }

}
