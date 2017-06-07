
public class Main {
    public static void main(String[] args) {
        String cod="4968858";
        ItemJSON myJson=Parser.getGSON(cod);
        System.out.println("item="+myJson.content.get(0).content.producer);
        System.out.println("price HRN="+myJson.content.get(0).content.price);
        System.out.println("price USD="+myJson.content.get(0).content.price_usd);
        System.out.println("rating="+myJson.content.get(0).content.users_rating);
        System.out.println("countComments="+myJson.content.get(0).content.count_comments);


    }


}