package chilijie.baway.com.recycleview_pubuliu;

/**
 * Created by MacBook- on 2017/4/7.
 */
public class Shop {
    private Info info;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Shop(Info info) {
        this.info = info;
    }
    public static class Info{
        private String default_image;
        private String loupan_name;

        public String getDefault_image() {
            return default_image;
        }

        public void setDefault_image(String default_image) {
            this.default_image = default_image;
        }

        public String getLoupan_name() {
            return loupan_name;
        }

        public void setLoupan_name(String loupan_name) {
            this.loupan_name = loupan_name;
        }

        public Info(String default_image, String loupan_name) {
            this.default_image = default_image;
            this.loupan_name = loupan_name;
        }
    }

}
