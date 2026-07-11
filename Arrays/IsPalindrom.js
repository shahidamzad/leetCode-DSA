//Given a array of string , print inly palindron string
// BY using two pointer logics
//  Askend in TCS Coding round


function isPalindrom(str) {

    let left = 0;
    let right = str.length - 1;

    while (left < right) {
        if (str[left] !== str[right]) {
            return false

        }
        left++;
        right--;
    }
    return true
}
const arr = ["hello", "madam", "level", "world", "noon"];

for (let item of arr) {
    if (isPalindrom(item)) {
        console.log(item);

    }
}