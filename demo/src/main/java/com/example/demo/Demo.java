package com.example.demo;

import com.example.demo.entity.Student;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/notify")
public class Demo {



    @GetMapping(value = "/sendSMS")
    public ResponseEntity<String> sendSMS(@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("gpa") String gpa) {
        System.out.println(name+  phone +", "+gpa);
        phone = "+"+phone;

            String kq = "Chào "+name+  "GPA hiện tại của bạn là: " + gpa
                    + "##";
//             Twilio.init("AC7815366b4b39930807b54cbed6f9df1c", "e991c02fd4ae0f7d670cee85d05f5729");

            Message.creator(new PhoneNumber(phone),
                    new PhoneNumber("+18597106546"), kq).create();

            return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);


    }
}
