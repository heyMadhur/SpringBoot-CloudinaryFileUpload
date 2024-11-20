package com.imageupload.CloudinaryFileUpload.Cloudinary;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cloudinary.Cloudinary;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary () {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dvfq9jqrf",
                "api_key", "839992644166131",
                "api_secret", "UudqaD_V0Nbfldb-WjSzZAgLHs4"
        ));

//        Map config = new HashMap();
//        config.put("cloud_name", "n07t21i7");
//        config.put("api_key", "123456789012345");
//        config.put("api_secret", "abcdeghijklmnopqrstuvwxyz12");
//        return new Cloudinary(config);
    }


}
