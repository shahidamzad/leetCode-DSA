/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(arr) {
    let ans = "";
 let  i = 0, j = 0;

while (j < arr.length) {
    if (arr[i] == arr[j]) {
        j++;
    } else {
        ans += arr[i];
        let len = j - i;   
        if (len > 1) ans += len;

        i = j;
    }
}


ans += arr[i];
let len = j - i;     
if (len > 1) ans += len;

for(i = 0 ; i < ans.length ; i++){
    arr[i] = ans[i]
}

return ans.length;
};