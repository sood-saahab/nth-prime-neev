class PrimeCalculator {

    int nth(int nth) {
        if(nth==0){
            throw new IllegalArgumentException();
            }
        else{
        int num=1,count=0,i;
        while(count<nth){
            num+=1;
            for(i=2;i<=num;i++){
                if(num%i==0)
                    break;
            }
            if(i==num)
                count+=1;
        }
        return num;
    }}
}
