package com.epam.training.student_tatsiana_mikhnavets.java_basics.work_with_strings.validations_color_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("#[0-9a-f]{3}|#[0-9a-f]{6}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(color);
        return matcher.matches();
    }
}
