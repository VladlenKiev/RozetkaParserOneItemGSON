import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 07.06.2017.
 */
public class Answer {
    @Test
    public void testMultiply() {
        String cod="4968858";


        ItemJSON myJson=Parser.getGSON(cod);


        assertEquals("reviewCount must be equals 49", 49, myJson.content.get(0).content.count_comments);
        assertEquals("price must be equals 219 hrn", 219, myJson.content.get(0).content.price);
        assertEquals("rating must be equals 5 usd", 5, myJson.content.get(0).content.users_rating);
        assertEquals("countComments must be equals 49", 49, myJson.content.get(0).content.count_comments);

    }
}
