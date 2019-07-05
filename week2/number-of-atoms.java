class Solution {
    String caps = "QWERTYUIOPASDFGHJKLZXCVBNM";
    String low = "qwertyuiopasdfghjklzxcvbnm";
    String nums = "1234567890";
    TreeMap<String, Integer> map = new TreeMap<>();
    public String countOfAtoms(String formula) {
        for(int i=0;i<formula.length();i++){
            String name="";
            int count;
             if(caps.indexOf(formula.charAt(i))>-1){
                 name=formula.charAt(i)+numLow(formula, i+1);
                 count=checkNum(formula, i+1);
                 count=count<1?1:count;
                 map.put(name, map.getOrDefault(name, 0)+count);
             }
            else if(formula.charAt(i)=='('){
                i=checkEndBracket(formula, i);
            }

        }
            //  String str = formula.replace(formula.substring(7,8), "12");
            // System.out.println(str);
        StringBuilder res=new StringBuilder();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            res=res.append(e.getKey());
            if(e.getValue()>1)
                res=res.append(e.getValue());
        }
        return res.toString();
    }
    public int checkEndBracket(String formula, int startIndex){
        int j=0;
        int endIndex=0;
        Stack<Integer> s = new Stack<>();
        for(int i=startIndex;i<formula.length();i++){
            if(formula.charAt(i)=='('){
                s.push((int) formula.charAt(i));
            }
            else if(formula.charAt(i)==')'){
                s.pop();
                if(s.isEmpty()){
                    endIndex=i;
                    break;
                }
            }
        }
        System.out.println(startIndex+" "+endIndex);
        int count=checkNum(formula,endIndex+1);
        addCount(formula, startIndex+1, endIndex-1, count);
        return endIndex;
    }
    public void addCount(String formula, int startIndex, int endIndex, int num){
        int flag=0;
        for(int i=startIndex;i<=endIndex;i++){
            String name="";
            int count;
             if(caps.indexOf(formula.charAt(i))>-1&&flag==0){
                 name=formula.charAt(i)+numLow(formula, i+1);
                 count=checkNum(formula, i+1);
                 count=count<1?1:count;
                 map.put(name, map.getOrDefault(name, 0)+count*num);
                 System.out.println("flag "+flag);
                 System.out.println(name+" "+map.get(name));
             }
            else if(formula.charAt(i)=='('){
                flag=1;
                System.out.println("flag "+flag);
            }
            else if(formula.charAt(i)==')'){
                flag=0;
                System.out.println("index "+i);
                int x = checkNum(formula,i+1);
                System.out.println("Number "+x);
                int y = checkHowManyNum(formula,i+1);
                System.out.println("Substring "+formula.substring(i+1, i+y+1));
                formula = formula.replace(formula.substring(i+1, i+y+1), String.valueOf(x*num));
                i=i+String.valueOf(x*num).length();
                System.out.println(formula);
            }
        }
        int r=0;
        for(int i=startIndex;i<=endIndex;i++){
            if(formula.charAt(i)=='(')
                r=checkEndBracket(formula, i);
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
          // System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public String numLow(String formula, int j){
        String ret="";
        for(int i=j;i<formula.length();i++){
            if(!(low.indexOf(formula.charAt(i))>-1))
                break;
            ret=ret+formula.charAt(i);
        }
        return ret;
    }
    public int checkNum(String formula, int i){
        int count=0;
        while(i<formula.length()&&!(caps.indexOf(formula.charAt(i))>-1)){
            if(formula.charAt(i)=='('||formula.charAt(i)==')')
                break;
            if(nums.indexOf(formula.charAt(i))>-1){
                count=count*10+Character.getNumericValue(formula.charAt(i));
            }
            i++;
        }
        return count;
    }
    public int checkHowManyNum(String formula, int i){
        int count=0;
        while(i<formula.length()&&!(caps.indexOf(formula.charAt(i))>-1)){
            if(formula.charAt(i)=='('||formula.charAt(i)==')')
                break;
            if(nums.indexOf(formula.charAt(i))>-1){
                count++;
            }
            i++;
        }
        return count;
    }
}
