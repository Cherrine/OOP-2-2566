public class Fraction {
    public int btmN;
    public int topN;
    
    public void addFraction(Fraction f){
        if (f.btmN == this.btmN){
            this.topN = this.topN + f.topN;
        }else if (f.btmN != this.btmN){
            this.topN = this.topN * f.btmN + f.topN * this.btmN;
            this.btmN = this.btmN * f.btmN;
        }
    }
    
    public String toFloat(){
        return "" + ((double) topN/btmN );
    }
    
    public String toFraction(){
        return topN + "/" + btmN;
    }
}
