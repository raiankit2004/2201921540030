class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map= new HashMap<>();
            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");
                List<String> result = new ArrayList<>();
                    if (digits.length() == 0) return result;  // if empty input
                   
                   mincomb(digits,0,"",map,result);//recursive call;
                   return result;
    }

    void mincomb(String digits,int index,String current,Map<Character,String> map
              ,List<String> result){ // ab if index==length then only add in list;

              if(index==digits.length()){
                result.add(current);
                return;
                }//current string me value jayegi
                
                String arr1= map.get(digits.charAt(index));   // for 2 -> abc
                for(int i=0;i<arr1.length();i++){
                    char ch= arr1.charAt(i); // abc se single elements todenge {a,b,c}
                  
                  mincomb(digits,index+1,current+ch,map,result);// curr="a" now 
                  // String arr1="def" , goes to loop and {d,e,f}
                  // index==2 so current="ad" and added to result and return to loop
                  // so curr="ae","af" then it goes to index==1 and curr="b" now because 
                  //for a we have recursive call done;
                  }
              }

    
    }
