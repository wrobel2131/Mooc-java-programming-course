
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        return new Money(this.euros+addition.euros(), this.cents+addition.cents);
    }
    
    public boolean lessThan(Money compared) {
        return (100*this.euros + this.cents) < (100*compared.euros + compared.cents);
    }
    
    public Money minus(Money decreaser) {
        int cents = (100*this.euros + this.cents) - (100*decreaser.euros+decreaser.cents);
        if(cents < 0) {
            return new Money(0,0);
        }
        return new Money(cents/100, cents%100);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
