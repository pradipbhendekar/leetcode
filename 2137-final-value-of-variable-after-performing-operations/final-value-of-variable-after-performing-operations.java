class Solution {
    public int finalValueAfterOperations(String[] str) {
     
     int number=0;

     for(int i=0;i<str.length;i++){
     if(str[i].contains("+")) {
    if(str[i].indexOf("+") == 0)
        ++number;
    else
        number++;
}
else {
    if(str[i].indexOf("-") == 0)
        --number;
    else
        number--;
}

    }
    return number;
}
}
