package eu.sig.training.ch05.buildandsendmail;

import java.util.Map;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Map<String, String> strings, MailFont font) {
        // Format the email address
        String mId = strings.get("firstName").charAt(0) + "." + strings.get("lastName").substring(0, 7) + "@"
            + strings.get("division").substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            strings.get("message1") + strings.get("message2") + strings.get("message3"));
        // Send message
        m.send(mId, strings.get("subject"), mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}