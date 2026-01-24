class StockSpanner {
     Stack<int[]> st; //{price,index}
    //  int indx=-1;
    public StockSpanner() {
       
        st=new Stack<>();
    }
    
    public int next(int price) {
        int span =1;
        // indx++;
        //pge logic
       //po all smaller and add its span 
        while(!st.isEmpty()&&st.peek()[0]<=price){ 
            span+=st.peek()[1];
            st.pop();
        }
    //     int pgeind=st.isEmpty() ? -1 : st.peek()[1];
    //   int span =indx-pgeind;
    //   st.push(new int[]{price,indx});
    //   return span;
    //push current price with its span
        st.push(new int[]{price,span});
    return span;
    }
   
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */