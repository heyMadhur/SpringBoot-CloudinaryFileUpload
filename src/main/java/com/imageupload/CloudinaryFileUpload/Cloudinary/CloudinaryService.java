package com.imageupload.CloudinaryFileUpload.Cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryService {

    @Autowired
    private Cloudinary cloudinary;

    public Map uploadFile(MultipartFile file) throws Exception {
        try{
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            return uploadResult;
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("Not Uploaded");
        }

    }

    public Map deleteFile(String publicId) {
        try {
            Map response= cloudinary.uploader().destroy(publicId, ObjectUtils.emptyMap());
            return response;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
