class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int res=0, x=0, y=0;
        for(String i : ops){
            if((i.charAt(0)>47&&i.charAt(0)<58)||i.charAt(0)==45){
                stack.push(Integer.parseInt(i));
                res=res+Integer.parseInt(i);
            }
            else if(i.equals("C")){
                x = (int)stack.pop();
                res=res-x;
            }
            else if(i.equals("D")){
                y = stack.peek();
                stack.push(y*2);
                res=res+(y*2);
            }
            else if(i.equals("+")){
                x=stack.pop();
                y=stack.peek();
                stack.push(x);
                stack.push(x+y);
                res=res+x+y;
            }
        }
        return res;
    }
}
