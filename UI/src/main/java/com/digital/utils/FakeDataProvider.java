package com.digital.utils;


import com.digital.models.Student;
import com.github.javafaker.Faker;

import javax.swing.text.PasswordView;

public class  FakeDataProvider {
        Faker faker = new Faker();

        public String generateFakeFullName() {
            return faker.name().fullName();
        }
        public  String generateFirstName(){
            return faker.name().firstName();
        }

        public String generateFakeLastName() {
            return faker.name().lastName();
        }

        public String generateFakeEmail() {
            return faker.internet().emailAddress();
        }

        public  String generationPhoneNUmber() {
            return faker.number().digits(10);
        }

        public String generationFakeCurrentAddress() {
            return faker.address().fullAddress();
        }
        public String generationFakePermanentAddress() {
            return faker.address().streetName() + " " + faker.address().streetAddressNumber();
        }
        public String generatationFakePassword(){
            return faker.internet().password();
        }
        public Student createfakerStudent(){
            Student student = new Student();
            student.setFirstName(generateFirstName());
            student.setLastName(generateFakeLastName());
            student.setEMail(generateFakeEmail());
            student.setPhoneNumber(generationPhoneNUmber());
            student.setCurrentAddress(generationFakeCurrentAddress());
            return  student;
        }

    //public static void main(String[] args) {
       // System.out.println(generateFakeFullName());
       // System.out.println(generateFirstName());
       // System.out.println(generateFakeEmail());
       // System.out.println(generationPhoneNUmber());
       // System.out.println(generationFakeCurrentAddress());
        //System.out.println(generationFakePermanentAddress());
    }




