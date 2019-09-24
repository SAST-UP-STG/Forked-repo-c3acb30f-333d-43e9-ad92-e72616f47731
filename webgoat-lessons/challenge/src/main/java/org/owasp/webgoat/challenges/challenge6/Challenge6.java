package org.owasp.webgoat.challenges.challenge6;

import org.owasp.webgoat.lessons.Category;
import org.owasp.webgoat.lessons.Lesson;
import org.springframework.stereotype.Component;

/**
 * @author nbaars
 * @since 3/21/17.
 */
@Component
public class Challenge6 extends Lesson {

    @Override
    public Category getDefaultCategory() {
        return Category.CHALLENGE;
    }

    @Override
    public String getTitle() {
        return "challenge6.title";
    }

    @Override
    public String getId() {
        return "Challenge6";
    }
}