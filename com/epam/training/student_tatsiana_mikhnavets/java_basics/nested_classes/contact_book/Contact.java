package com.epam.training.student_tatsiana_mikhnavets.java_basics.nested_classes.contact_book;

public class Contact {
    private String contactName;
    private final ContactInfo name = new NameContactInfo();
    private final Email[] emails = new Email[3];
    private int countEmail = 0;
    private ContactInfo phoneNumber;
    private int countPhoneNumber = 0;
    private final Social[] socialMedias = new Social[5];
    private int countSocialMedia = 0;


    public Contact(String contactName) {
        this.contactName = contactName;
    }
    private class NameContactInfo implements ContactInfo {
        @Override
        public String getTitle() {
            return "Name";
        }
        @Override
        public String getValue() {
            return contactName;
        }
    }
    public static class Email implements ContactInfo {
        public String title = "Email";
        public String email;
        public Email(String localPart, String domain) {
            email = localPart + "@" + domain;
        }
        @Override
        public String getTitle() {
            return title;
        }
        @Override
        public String getValue() {
            return email;
        }
    }
    public static class Social implements ContactInfo {
        private final String title;
        private final String value;
        public Social(String title, String id) {
            this.title = title;
            this.value = id;
        }
        @Override
        public String getTitle() {
            return title;
        }
        @Override
        public String getValue() {
            return value;
        }
    }

    public void rename(String newName) {
        if (newName != null && newName.length() >0) {
            this.contactName = newName;
        }
        //Implement this method
    }

    public Email addEmail(String localPart, String domain) {
        return addEmailToEmails(new Email(localPart, domain));
    }


    public Email addEpamEmail(String firstname, String lastname) {
        Email epamEmail = new Email(firstname, lastname) {
            private final String email = firstname + "_" + lastname + "@epam.com";

            public String getTitle() {
                return "Epam Email";
            }
            public String getValue() {
                return email;
            }
        };
        return addEmailToEmails(epamEmail);
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        ContactInfo phoneNumber = new ContactInfo() {
            private final String value = "+" + code + " " + number;

            public String getTitle() {
                return "Tel";
            }
            public String getValue() {
                return value;
            }
        };
        if (countPhoneNumber ==0) {
            this.phoneNumber = phoneNumber;
            countPhoneNumber ++;
            return phoneNumber;
        }
        return null;
    }

    public Social addTwitter(String twitterId) {
        return addSocialMediaToSocialMedias(new Social("Twitter", twitterId));
    }

    public Social addInstagram(String instagramId) {
        return addSocialMediaToSocialMedias(new Social("Instagram", instagramId));
    }

    public Social addSocialMedia(String title, String id) {
        return addSocialMediaToSocialMedias(new Social(title, id));
    }

    public ContactInfo[] getInfo() {
        ContactInfo[] allInfo = new ContactInfo[1 + countPhoneNumber + countEmail + countSocialMedia];
        int contact = 0;
        allInfo[0] = name;
        contact ++;

        if (countPhoneNumber == 1) {
            allInfo[1] = phoneNumber;
            contact++;

        }

        System.arraycopy(emails,0,allInfo,contact,countEmail);
        contact+=countEmail;

        System.arraycopy(socialMedias,0,allInfo,contact,countSocialMedia);
        contact+= countSocialMedia;
        return allInfo;
    }
    private Email addEmailToEmails(Email email) {
        if (countEmail< emails.length) {
            emails [countEmail] = email;
            countEmail++;
            return email;
        }
        return null;
    }
    private Social addSocialMediaToSocialMedias(Social socialMedia) {
        if (countSocialMedia<socialMedias.length) {
            socialMedias[countSocialMedia] = socialMedia;
            countSocialMedia++;
            return socialMedia;
        }
        return null;
    }
}
