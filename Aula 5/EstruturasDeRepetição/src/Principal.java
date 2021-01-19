
public class Principal {
    public static void main(String[] args) {
        int number = 0;
        int numberSelected = 7;
        int mTable;
        
        // Enquanto -> While 
//        while(number<11){
//            mTable = numberSelected * number;
//            System.out.printf("%d X %d = %d\n",numberSelected,number,mTable);
//            number++;
//        }
           //faça-enquanto
//        do{
//            mTable = numberSelected * number;
//            System.out.printf("%d X %d = %d\n",numberSelected,number,mTable);
//            number++;
//        }while (number<11);

        for(int i=0; i <11; i++){ //i de iscola ou i de index ou i de indice
             mTable = numberSelected * i;
             System.out.printf("%d X %d = %d\n",numberSelected,i,mTable);
        }
            
    }
    
}
