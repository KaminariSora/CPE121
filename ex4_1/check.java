class check{
    public int error;
    public check(){
        error = 0;
    }
    public void A(int a,int b,int c){
        if((a>b && a>c) || (c<b && c<a)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}