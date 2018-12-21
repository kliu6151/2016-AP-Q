package com.company;

import java.util.ArrayList;

public class RandomStringChooser {
        private int i = 0;
        private String[] wordArray;

        public RandomStringChooser(String[] wordArray) {
            this.wordArray = wordArray;
        }

        public String getNext() {
            return this.i < this.wordArray.length ? this.wordArray[this.i++] : "NONE";
        }
}
