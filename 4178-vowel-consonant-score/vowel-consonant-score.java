class Solution {
    public int vowelConsonantScore(String s) {
        int cntvowel=0;
        int cntconsonent=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                //check vowel
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    cntvowel++;
                }
                else{
                    cntconsonent++;
                }
            }
        }
        if(cntconsonent>0){
            return cntvowel/cntconsonent;
        }
        else{
            return 0;
        }
    }
}