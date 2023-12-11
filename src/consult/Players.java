package consult;

public class Players {

    public String nickname;

    public int CartNummer1;
    public int CartNummer2;
    public int CartNummer3;


    public Players(String nickname, int cartNummer1, int cartNummer2, int cartNummer3) {
        this.nickname = nickname;
        CartNummer1 = cartNummer1;
        CartNummer2 = cartNummer2;
        CartNummer3 = cartNummer3;

    }

    @Override
    public String toString() {
        return "Players{" +
                "nickname='" + nickname + '\'' +
                ", CartNummer1=" + CartNummer1 +
                ", CartNummer2=" + CartNummer2 +
                ", CartNummer3=" + CartNummer3 +
                '}';
    }
}