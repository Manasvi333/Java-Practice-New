public class Methods {
    void PrintWelcomeMessage(){
        System.out.println("Namaste Everybody");
    }
    int Add(int a,int b){
        int sum=a+b;
        return sum;
    }
    String IsItEven (int a){
        if(a%2==0){
                return "Even";
        } else {
                return "Odd";
        }
    }
  int GetMax(int a,int b){
    if(a>b){
        return a;
    }
    else{
        return b;
  }
}
int GetPercentage(int obtained,int total){
    int percentage=(obtained*100)/total;
    return percentage;
}
public void main(String args[]){
    PrintWelcomeMessage();
int result = Add(10,20);
System.out.println("Sum is: "+result);
String result1 = IsItEven(10);
System.out.println("Is it Even or Odd: "+result1);
int result2 = GetMax(10,20);
System.out.println("Max is: "+result2);
int result3 = GetPercentage(80,100);
System.out.println("Percentage is: "+result3);
}
}