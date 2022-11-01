package dssc.assignment.fizzbuzz;
public class FizzBuzzBang{
    public String stampa() {
        String s="";
        for (int i=1; i<106; i++){
            if (i%3==0){
                s+="Fizz" ;
            }
            if (i%5==0){
                s+="Buzz";
            }
            if (i%7==0){
                s+="Bang";
            }
            if (i%3!=0 && i%5!=0 && i%7!=0){
                s+=Integer.toString(i);
            }
            s+=" ";
        }
        return s;
    }
}
