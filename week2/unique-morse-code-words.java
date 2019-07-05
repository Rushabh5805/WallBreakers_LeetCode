class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int x = (int)'a';
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morseCode = new String[words.length];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                morseCode[i]=morseCode[i]+morse[(int)words[i].charAt(j)-97];
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int r=0;r<morseCode.length;r++){
            if(!map.containsKey(morseCode[r])){
                map.put(morseCode[r],1);
            }
        }
        return map.size();
    }
}
