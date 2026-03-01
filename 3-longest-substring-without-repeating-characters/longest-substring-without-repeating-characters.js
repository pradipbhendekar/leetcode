/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let sub=""
    let current=""

    for(let i=0;i<s.length;i++){
        let ch=s.charAt(i);
        if(current.includes(ch)){
            while(current.includes(ch)){
                current=current.substring(1);
            }
        }
            current=current+ch

            if(current.length>sub.length){
                sub=current
            }
        
    }
    return sub.length;
};