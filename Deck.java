import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Card{
    int suit; //0:ハート　1:ダイヤ 2:スペード 3:クラブ
    int no; //1~13
}

public class Deck{
    final int totalCards = 51;
    private List<Integer> cardList;
    private int cardIndex = 0;

    public Deck(){
        this.cardIndex = 0;

        cardList = new ArrayList<Integer>();
        for(int i=0; i<52; i++){
            this.cardList.add(i);
        }

        Collections.shuffle(this.cardList);
        }

    public Card getCard(){
        int CardNo = this.cardList.get(this.cardIndex);
        this.cardIndex++;

        if(this.cardIndex > totalCards){
            this.cardIndex = 0;
            Collections.shuffle(this.cardList);
        }

        Card c = new Card();
        c.no = CardNo % 13 +1;
        c.suit = CardNo / 13;

        return c;
    }
}