public static boolean selfdivisor(int number){
int n = number;
while (n > 0){
int digit = n % 10;
if(digit == 0 || number % digit !=0){
return false;
}
}
return true;
} //they mad that we droppin hat but its just for the B

public static int[] firstNumselfdivisor(int start, int num){

int collection [] = new int[num];

int count = 0;
while (count < num){
  if(selfdivisor(start)){
    
  }
}
}
