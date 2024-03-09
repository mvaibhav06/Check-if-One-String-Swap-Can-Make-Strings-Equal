public class IsStringEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char[] temp = s1.toCharArray();
        int i = 0;
        int counter = 0;
        int[] indexes = new int[2];
        int j = 0;
        while(i < s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            else{
                counter++;
                if(counter > 2){
                    return false;
                }
                indexes[j] = i;
                j++;
                i++;

            }
        }

        char ch = temp[indexes[0]];
        temp[indexes[0]] = temp[indexes[1]];
        temp[indexes[1]] = ch;

        char[] temp1 = s2.toCharArray();

        for(int p=0; p<temp.length; p++){
            if(temp[p] != temp1[p]){
                return false;
            }
        }

        return true;
    }
}
