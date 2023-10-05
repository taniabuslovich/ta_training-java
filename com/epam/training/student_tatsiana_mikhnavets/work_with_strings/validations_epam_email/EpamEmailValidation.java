package com.epam.training.student_tatsiana_mikhnavets.work_with_strings.validations_epam_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+_[a-zA-Z]+\\d*@epam\\.com", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
