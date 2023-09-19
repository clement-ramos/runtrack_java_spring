package com.jour02.springApplication.models;

import javax.validation.constraints.Min;
public class Message {

        private String content;

        @Min(value = 18, message = "Vous devez avoir au moins 18 ans pour vous inscrire")
        private int age;

        public Message(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }


}
