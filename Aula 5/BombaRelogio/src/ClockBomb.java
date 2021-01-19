public class ClockBomb {

    public void BombOne() {
        int timer = 10;

        while (timer >= 0) {
            System.out.printf("%d for explosion !!!\n",timer);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            timer--;
        }
        System.out.println("Booommmmm!!!");
    }
    
    public void BombTwo(){
        int timer = 10;
           
        do{
           System.out.printf("%d for explosion\n",timer);
            timer--;
            try{ Thread.sleep(1000); }catch(Exception e){}
        }while(timer>0);
        System.out.println("Booommmmm!!!");
    }
    public void BombThree(){
        for(int timer = 10; timer >0; timer --){
            System.out.printf("%d for explosion!!!!\n",timer);
            try{Thread.sleep(1000);}catch(Exception e){}
        }//Fim do for
        System.out.println("Booommmmmm!!!");
    }
}
