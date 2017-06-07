import java.util.ArrayList;


public class ItemJSON {
    int code;
    ArrayList<Content1JSON> content=new ArrayList<Content1JSON>();

    class Content1JSON {
        int code;
        Content2JSON content;

        class Content2JSON {
            String title;
            int product_id;
            int price;
            int seller_id;
            int merchant_id;
            ImageJSON image;
            ImageJSON large_image;
            String sell_status;
            String status;
            boolean isActive;
            int id;
            String href;
            String href_ua;
            Double price_usd;
            int old_price;
            String unit;
            int parent_id;
            String producer;
            int producer_id;
            double users_rating;
            int count_comments;
            int count_marks;
            String comments_href;
            int top_parent_id;
            String docket;

            class ImageJSON {
                String url;
                int width;
                int height;
            }
        }
    }
}