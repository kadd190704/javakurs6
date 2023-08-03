package Gün29.Soru;

public class Hesap {
    int yatan;
    int çekilen;
    int bakiye;

    public void paraYatır(int yatanPara){
        this.yatan=this.yatan+yatanPara;
        this.bakiye=this.bakiye+yatanPara;
    }

    public void paraÇek(int çekilenPara){
        this.çekilen=this.çekilen+çekilenPara;
        this.bakiye=this.bakiye-çekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "toplam yatan=" + yatan +
                ", toplam çekilen=" + çekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
