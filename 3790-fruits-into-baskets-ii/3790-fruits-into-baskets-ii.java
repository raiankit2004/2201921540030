class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int m=fruits.length;
        int c=0;
        List<Integer> list=new ArrayList<>();
        for(int p:baskets)list.add(p);
          for(int i=0;i<m;i++){
              for(int j=0;j<list.size();j++){
                  if(list.get(j)>=fruits[i]){
                     c++;
                     list.remove(j);
                     break;
                    }
                }  
            }
        return m-c;
    }
}