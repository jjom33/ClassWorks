package corejava6;

public class BMW {
    static int[] monthlySaleForAllBMW = {46,70,88,45}; //x1, x2, x3
    static int[] monthlySalePerPersonForAllBMW = {0,0,0}; //Person1, Person2, Person3
    static int numOfModels=0;
    // for the model itself
    final int MODEL_INDEX_NUMBER = numOfModels;
    String modelName;
    int sold;
    int[] salePerPerson ={0,0,0};
    public BMW(String modelName){
        this.modelName = modelName;
        this.sold = 0;
        BMW.numOfModels++;
    }
    public String getModelName(){
        return this.modelName;
    }
    public int getSold(){
        return this.sold;
    }
    public int[] getSalePerPerson(){
        return this.salePerPerson;
    }
    public void updateDailySale(int personNum, int numOfCarSold){
        //update for this model
        this.sold +=numOfCarSold;
        this.salePerPerson[personNum-1]+=numOfCarSold;
        System.out.println("Updated: Person"+personNum+" sold "+numOfCarSold+" "+this.modelName + " today.");
    }
    void updateMonthlySale(){
        BMW.monthlySaleForAllBMW[MODEL_INDEX_NUMBER] += this.sold;
    }
    void printDailySale(){
        String perPersonStr ="";
        for (int i=0;i<this.salePerPerson.length;i++){
            perPersonStr+="\n\t-Person"+(i+1)+": "+this.salePerPerson[i];
        }
        System.out.println(this.modelName+" Daily sale total: "+this.sold    
                            +perPersonStr
                            +"\n"+this.modelName+" Monthly sale total: "+BMW.monthlySaleForAllBMW[MODEL_INDEX_NUMBER]);
    }

}
