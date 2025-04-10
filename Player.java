public class Player{

    private Card cardInfo;

    public void Draw(Deck deck){
        this.cardInfo = deck.getCard();
    }

    public Player(){
        this.cardInfo = new Card();
        this.cardInfo.no = 0;
        this.cardInfo.suit = 0;
    }

    public int getCardNo(){
        return this.cardInfo.no;
    }

    public int getCardSuit(){
        return this.cardInfo.suit;
    }
}